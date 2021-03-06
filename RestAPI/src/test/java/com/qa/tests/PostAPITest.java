package com.qa.tests;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.BaseClass;
import com.qa.clients.RestClients;
import com.qa.data.Users;

public class PostAPITest extends BaseClass {
	BaseClass baseClass;
	RestClients restClients;
	String baseURL;
	String serviecURL;
	String url;
	CloseableHttpResponse CloseableHttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		baseClass = new BaseClass();
		baseURL = prop.getProperty("baseURL");
		serviecURL = prop.getProperty("serviceURL");
		
		//Base URL to get data means "https://reqres.in/api/users"
		url = baseURL + serviecURL;
	}
	
	@Test
	public void postAPITest() throws JsonGenerationException, JsonMappingException, IOException {
		restClients = new RestClients();
		
		//Creating Map to put header in key value pair
		HashMap<String, String> headerMap = new HashMap<String, String>();
		headerMap.put("Content-Type", "application/json");
		
		// jackson API (It is use to convert java class file to json object)
		ObjectMapper mapper = new ObjectMapper();
		Users users = new Users("morphis", "leader");//Expected user Object 
		
		//Java object to json object
		mapper.writeValue(new File("C:\\Users\\Admin\\eclipse-workspace\\RestAPI\\src\\main\\java\\com\\qa\\data\\users.json"), users);
		           //or we can use below method to marshaling(convert java class file to json object)
		//Java object to json String
		String userJsonString = mapper.writeValueAsString(users);
		System.out.println(userJsonString); //To validate marshaling
		
		//Calling API
		CloseableHttpResponse = restClients.post(url, userJsonString, headerMap);
		
		// 1.Status Code
		int statuscode = CloseableHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statuscode, baseClass.Respons_Status_Code_201);
		
		// 2.Json String 
		String responseString = EntityUtils.toString(CloseableHttpResponse.getEntity(), "UTF-8");
		//String to Json format
		JSONObject responseJSON = new JSONObject(responseString);
		System.out.println("Response from POST call: " + responseJSON);
		
		//JSON to java object conversion (unmarshaling)
		Users userRespObj = mapper.readValue(responseString, Users.class); //Actual user object
		System.out.println(userRespObj);
		
		Assert.assertTrue(users.getName().equals(userRespObj.getName()));
		Assert.assertTrue(users.getJob().equals(userRespObj.getJob()));
		
		System.out.println(userRespObj.getId());
		System.out.println(userRespObj.getCreatedAt());
	}
	
}
