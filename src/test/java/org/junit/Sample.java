package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample extends FacebookLogin{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	FacebookLogin fb= new FacebookLogin();
	WebElement txtemail = fb.getTxtemail();
	txtemail.sendKeys("welcome");
	WebElement txtpass = fb.getTxtpass();
	txtpass.sendKeys("Hello");
	WebElement btnLogin = fb.getBtnLogin();
	btnLogin.click();
	
}
}
