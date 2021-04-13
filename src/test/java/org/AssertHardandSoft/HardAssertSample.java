package org.AssertHardandSoft;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;

public class HardAssertSample extends BaseClass {
@BeforeClass
private void beforeClass() {
	getDriver();
	loadUrl("https://www.facebook.com/");
	maximize();
}
@BeforeMethod
private void beforeMethod() {
	Date();
}
//Hard-Assert
//@Test
//private void tc0() {
//WebElement txtUserName = driver.findElement(By.id("email"));
//txtUserName.sendKeys("iswarya");
//String attribute = txtUserName.getAttribute("value");
//Assert.assertEquals("iswarya", attribute);
//}

//Soft-Assert
@Test
private void tc1() {
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("iswarya");
	String attribute = txtUserName.getAttribute("value");
	SoftAssert assert1= new SoftAssert();
	assert1.assertEquals("iswaryaa", attribute);
	assert1.assertAll();
	System.out.println("Assert Fails");
}

@Test
private void tc2() {
	System.out.println("End");

}
@AfterMethod
private void Screenshot(Method method) throws IOException {
	screenShot(method.getName());
}

@AfterClass
private void browserClose() {
	quitBrowser();
}


}
