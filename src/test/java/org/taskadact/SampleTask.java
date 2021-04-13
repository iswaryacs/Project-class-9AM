package org.taskadact;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class SampleTask extends BaseClass{
@BeforeClass
private void beforeClass() {
	getDriver();
	loadUrl("https://www.redbus.in/");
	maximize();
}
@BeforeMethod
private void beforeMethod() {
	Date date= new Date();
	System.out.println(date);
}
@Test (dataProvider="Data", dataProviderClass=SampleTask1.class)
private void tc0(String s, String s1) {
	WebElement txtSource = driver.findElement(By.xpath("//input[@id='src']"));
	txtSource.sendKeys(s);
	WebElement txtDest = driver.findElement(By.xpath("//input[@id='dest']"));
	txtDest.sendKeys(s1);
}

/*@DataProvider (name="Data")
public Object[][] loginData(){
	return new Object[][] {{"chennai", "coimbatore"}, {"chennai", "thanjavur"}, {"chennai", "madurai"}};
}*/

@AfterMethod
private void Screenshot(Method method) throws IOException {
	screenShot(method.getName());
}

@AfterClass
private void browserClose() {
	quitBrowser();
}


}
