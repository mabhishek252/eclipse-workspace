package seleniumBasics;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;


public class LoginCRM extends BaseClass {

	public static void main(String[] args) throws Exception {
		BaseClass bc = new BaseClass();
		bc.setUp();

		// Maximize Browser
		driver.manage().window().maximize();

		// Implementing Wait for on each consecutive steps
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		// provide username and password from properties file to get login CRM site
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.xpath("//*[@type='submit']")).click();

		// Quit browser
		bc.teardown();
	}

}
