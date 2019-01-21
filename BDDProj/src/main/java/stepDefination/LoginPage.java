package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import com.utils.BaseClass;
import com.utils.LoginPageElmt;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;


public class LoginPage extends BaseClass{
	
	@Before
	public void clearcaches() {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);

		ChromeOptions opts = new ChromeOptions();
		opts.addArguments("start-maximized");
		capabilities.setCapability(ChromeOptions.CAPABILITY, opts);
	}
	
	@Given("^User already on login page$")
	public void User_already_on_login_page() throws Exception {
		BaseClass.setUp();
		String Title = driver.getTitle();
		System.out.println(Title);
	}

	@When("^When login section display$")
	public void when_login_section_display()  {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
	if(username.isDisplayed() && password.isDisplayed()) {
			System.out.println("Username and password section is displaying");
		}
	}

	@Then("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_and(String arg1, String arg2) throws InterruptedException {
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.clear();
		username.sendKeys(arg1);
		password.clear();
		password.sendKeys(arg2);
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws InterruptedException {
		WebElement submitbtn = driver.findElement(By.xpath("//div[@class='input-group-btn']/input"));
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='input-group-btn']/input")));
		wait.until(ExpectedConditions.elementToBeClickable(submitbtn));
		submitbtn.click();
		
	}

	@SuppressWarnings("deprecation")
	@Then("^User on Dashboard page$")
	public void user_on_Dashboard_page() {
		String Title = driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals("CRMPRO", Title);
	}
	
	@Then("^Click on logout button$")
	public void click_on_logout_button() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement logoutbtn = driver.findElement(By.xpath("//div[@class='noprint']//tr/td[4]/a"));	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		if(logoutbtn.isDisplayed()) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='noprint']//tr/td[4]/a")));
			js.executeScript("arguments[0].click();", logoutbtn);
		}
		
		
		/*
		//WebElement logoutbtn = driver.findElement(By.xpath("//*[contains(text(),'Logout')]"));
		//WebElement logoutbtn = driver.findElement(By.xpath("//a[@href='https://www.freecrm.com/index.cfm?logout=1']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='noprint']//tr/td[4]/a")));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) logoutbtn));*/
		//logoutbtn.click();
	}
	
}
