package seleniumBasics;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowser extends BaseClass{
	
	//private Properties properties = new Properties(); 
	
/*	
	public void Launchbrowser() {
		
		try {
			setUp("https://www.google.com");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	
	
	
	
	
	
/*	public void launchBrowser(String url) throws FileNotFoundException, IOException {
		
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\configproperties\\test.properties");
		//src\main\java\configproperties\test.properties
		FileReader fr = new FileReader(f);
		properties.load(fr);
		
		properties.load(new FileReader(new File(System.getProperty("user.dir") + "/src/main/java/configproperties/test.properties")));
		System.setProperty("webdriver.chrome.driver", properties.getProperty("webdriver.chrome.driver"));
		driver = new ChromeDriver();
		driver.get(url);
	}*/
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		
		/*
			LaunchBrowser LB = new LaunchBrowser();
			LB.Launchbrowser();
			*/
			//LB.launchBrowser("https://mail.google.com/");
		
		
		//Launch FireFox Driver
		/*System.setProperty("webdriver.gecko.driver", "C:/Users/Admin/Downloads/AutomationTest/geckodriver-v0.23.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();*/
		
		//Launch ChromDriver
//		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/AutomationTest/chromedriver_win32/chromedriver.exe");
		
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();*/
		
		//Implicit Wait
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait
		/*WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));	*/
			
		/*if(driver.getTitle().equals("Google")) {
			System.out.println("We launch Google page");
			System.out.println(driver.getCurrentUrl() + "\n" + driver.getTitle());
		}else {
			System.out.println("We are in some other page " + driver.getTitle());
		}
		
		//Close Browser
		driver.quit();*/
		
		
	}

}
