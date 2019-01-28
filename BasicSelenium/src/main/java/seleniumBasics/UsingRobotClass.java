package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class UsingRobotClass {
	static Robot rb; 
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		rb = new Robot();
		System.setProperty("webdriver.gecko.driver","C:/Users/Admin/Downloads/AutomationTest/geckodriver-v0.23.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/word_clock/");
		Thread.sleep(5000);
		WebElement downloadLink = driver.findElement(By.partialLinkText("word clock.xlsm"));
		Thread.sleep(5000);
		downloadLink.click();
		
		Thread.sleep(5000);
		//Down arrow Key press
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		System.out.println("Press Down arrow key to select save file option");
		
		Thread.sleep(2000);
		//Press Tab key 3 times
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Press tab Key");
		
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Press tab Key");
		
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		System.out.println("Press tab Key");
		
		Thread.sleep(2000);
		//Press Enter button to click on OK button
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Press Enter Key to download file");
		
	}

}
