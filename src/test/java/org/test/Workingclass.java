package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class Workingclass {
	static WebDriver driver;
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		BaseClass global = new BaseClass();
		BaseClass.getDriver();
		BaseClass.loadUrl("https://www.facebook.com//");
		global.title();
		global.currentUrl();
		BaseClass.maximize();
		//WebElement dDnFruit = driver.findElement(By.id("fruits"));
		Thread.sleep(3000);
		//global.DropDownSelectByIndex(dDnFruit, 0);
		//global.DropDownSelectByValue(dDnFruit, "orange");
		//global.DropDownSelectByVisibleText(dDnFruit, "Apple");
		//global.DropDownGetOptions(dDnCars);
		//global.DropDownAllSelectedOptions(dDnFruit);
		//global.DropDownFirstSelectedOptions(dDnCountry);
		//global.DropDownDeSelectByIndex(dDnFruit,1);
		//global.DropDownDeSelectByValue(dDnFruit, "orange");
		//global.DropDownDeSelectByVisibleText(dDnFruit, "Banana");
		//global.DropDownDeSelectAll(dDnFruit);
		//global.DropDownIsMultiple(dDnFruit);
		//global.navigatetoUrl("Facebook.com");
		
		//global.LocatorByXpath("");
		global.isDisplayed(global.LocatorByXpath("//input[@type='text']"));
		
		
		
	
		//WebElement element = driver.findElement(By.xpath(""));
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Quesion2=Flipkart
		
		/*WebElement xmark = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		global.btnClick(xmark);

		WebElement cursormove = driver.findElement(By.xpath("//div[text()='Electronics']"));
		global.ActionMoveToElements(cursormove);

		WebElement rightcl = driver.findElement(By.xpath("//div[text()='Electronics']"));
		global.ActionRightClick(rightcl);
		
		global.RobotKeyBoard();
		
		global.quitBrowser();
		global.close();*/
	
		//Question3=Flipkart and Facebook
		//WebElement txtEnter = driver.findElement(By.name("q"));
				//global.type(txtEnter,"Iphone");
				//global.AttributeValue(txtEnter);
				/*WebElement txtPassword = driver.findElement(By.id("pass"));
				global.type(txtPassword,"welcome");
				global.AttributeValue(txtPassword);*/
				//WebElement btnLogin = driver.findElement(By.xpath("//input[@type='submit']"));
				//global.btnClick(btnLogin);
				/*WebElement a = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
				global.text(a);
		//Question 4 screenshot scrollup and scrolldown
		global.screenShot("C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\Screenshot\\ishu.png");
		WebElement scrollView = driver.findElement(By.id("submitbtn"));
		global.ScrollDown(scrollView);
		WebElement scrollUp = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		global.ScrollUpPage(scrollUp);
		//Question 5 and 6 Redbus.in
		global.confimrAlert();
		global.promptAlert();
		global.AlertText();
		*/
	}

}
