package seleniumBasics;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {
	
	public void screeshot(WebDriver driver, long ms) {
		 try {
			 TakesScreenshot screenshot = (TakesScreenshot) driver;
			 File source = screenshot.getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(source, new File("./ScreenShots/"+ms+"Facebook.png"));
			 System.out.println("ScreenShot Taken");
		
		 } catch (IOException e) {
			 System.out.println("Exception while taking ScreenShot "+e.getMessage());
		}
	 }

}
