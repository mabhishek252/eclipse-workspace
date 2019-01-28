package seleniumBasics;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass extends Utilities{
	public static WebDriver driver;
	public static Properties properties = new Properties();
	 
	 public void setUp() throws Exception {
		 properties.load(new FileReader(new File(System.getProperty("user.dir") + "/src/main/java/configproperties/test.properties")));
	     System.setProperty("webdriver.chrome.driver",properties.getProperty("webdriver.chrome.driver") );
	     driver = new ChromeDriver();
	     driver.get(properties.getProperty("url"));
	 }
	 
	 
	 public void setUp(String BrowserName, String URL) {
		 try {
			 properties.load(new FileReader(new File(System.getProperty("user.dir") + "/src/main/java/configproperties/test.properties")));
			 if(BrowserName.equalsIgnoreCase("Chrome")) {
				    
				 System.setProperty("webdriver.chrome.driver",properties.getProperty("webdriver.chrome.driver") );
				 driver = new ChromeDriver();
			     
			 }else if(BrowserName.equalsIgnoreCase("Firefox")){
			     
				 System.setProperty("webdriver.gecko.driver",properties.getProperty("webdriver.gecko.driver") );
			     driver = new FirefoxDriver();
			
			 }else {
				 System.out.println("Browser Name is not currect please provide Browser Name either 'Chrome' or 'Firefox'");
			 }
		 
		 }catch(Exception e) {
			 System.out.println("Error message on Method is: " + e.getMessage());
		 }
	       
			driver.get(URL);
	 }
	 
	 
	 public void teardown() {
		 driver.quit();
	 }

}
