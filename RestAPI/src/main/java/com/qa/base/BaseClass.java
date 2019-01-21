package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
/*
 * HTTP defines forty standard status codes that can be used to convey the results of a client’s request. 
 * The status codes are divided into the five categories presented below:
 * 	1xx - Informational status code 
 * 	2xx - Success status code 
 * 	3xx - Redirection status code 
 * 	4xx - Client error status code 
 * 	5xx - Server error status code
*/
	
	//API response Status Code
	public int Respons_Status_Code_200 = 200; //Success
	public int Respons_Status_Code_201 = 201; //Create successfully
	public int Respons_Status_Code_400 = 400; //Bad Request
	public int Respons_Status_Code_401 = 401; //Unauthorized
	public int Respons_Status_Code_403 = 403; //Forbidden
	public int Respons_Status_Code_404 = 404; //Page not found
	public int Respons_Status_Code_405 = 405; //Method not found
	public int Respons_Status_Code_406 = 406; //Not Accepted
	public int Respons_Status_Code_412 = 412; //Precondition Failed
	public int Respons_Status_Code_415 = 415; //Unsupported Media Type
	public int Respons_Status_Code_500 = 500; //Internal server error
	
	public Properties prop;
	final static String fileName = "C:\\Users\\Admin\\eclipse-workspace\\RestAPI\\src\\main\\java\\com\\qa\\config\\config.properties";

	// constructor to load config.proprties file
	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config.properties");
			//FileInputStream fileInputStream = new FileInputStream(fileName);
			prop.load(fileInputStream);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
