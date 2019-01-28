package seleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingAutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:/Users/Admin/Downloads/AutomationTest/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/word_clock/");
		Thread.sleep(5000);
		WebElement downloadLink = driver.findElement(By.partialLinkText("word clock.xlsm"));
		Thread.sleep(5000);
		downloadLink.click();
		Thread.sleep(5000);
		//Write the below code to invoke the AutoIt .exe file and it throws IOException
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Downloads\\AutomationTest\\AutoIT\\SpreadSheetDownload.exe");
		
		/*Thread.sleep(15000);
		driver.quit();
		*/
		
		
	}

}
