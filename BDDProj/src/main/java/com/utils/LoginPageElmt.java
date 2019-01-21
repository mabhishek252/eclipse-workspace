package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageElmt extends BaseClass{
	public static WebElement username = driver.findElement(By.name("username"));
	public static WebElement password = driver.findElement(By.name("password"));
	public static WebElement submitbtn = driver.findElement(By.xpath("//*[@type='submit']"));
	public static WebElement logoutbtn = driver.findElement(By.xpath("//*[contains(@href,'logout')]"));
}
