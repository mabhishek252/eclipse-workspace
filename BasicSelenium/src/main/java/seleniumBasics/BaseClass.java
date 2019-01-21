package seleniumBasics;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static Properties properties = new Properties();
	
	 public void setUp() throws Exception {
	        properties.load(new FileReader(new File(System.getProperty("user.dir") + "/src/main/java/configproperties/test.properties")));
	        System.setProperty("webdriver.chrome.driver",properties.getProperty("webdriver.chrome.driver") );
	        driver = new ChromeDriver();
			driver.get(properties.getProperty("url"));
	 }
	 
	 public void teardown() {
		 driver.quit();
	 }
	 
}
