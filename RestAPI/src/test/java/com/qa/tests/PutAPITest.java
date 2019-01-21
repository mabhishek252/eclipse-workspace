package com.qa.tests;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.BaseClass;
import com.qa.clients.RestClients;
import com.qa.data.Users;

public class PutAPITest extends BaseClass{
	BaseClass baseClass;
	RestClients restClient;
	String url;
	
	@BeforeMethod
	public void sdtup() {
		baseClass = new BaseClass();
		String baseURL = prop.getProperty("baseURL");
		String serviceURL = prop.getProperty("serviceURL");
		url = baseURL + serviceURL;
	}
	
	@Test
	public void putAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClients();
		
		//Create mapper object for marshaling
		ObjectMapper mapper = new ObjectMapper();
		Users user =new Users("morphis", "XYZ");
		
		//Java object to json object
		String jsonStrgValue = mapper.writeValueAsString(user);
		//System.out.println(jsonStrgValue);
		
		//Execute put method 
		CloseableHttpResponse closeableHttpResponse = restClient.put(url, jsonStrgValue);

		//1.Fetch Status code
		int StatusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println(StatusCode);
		
		//2.Fetch JSON Response 
		String jsonRespString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");
		
		//String to JSON
		JSONObject jsonObj = new JSONObject(jsonRespString);
		System.out.println("Response from put API call as JSON : " + jsonObj);
	
		
	}
	
}
