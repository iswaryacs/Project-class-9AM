package org.taskadact;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class AdactinHotelWorkingClass extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		maximize();
	}

	@Parameters({ "username", "password" })
	@Test
	private void test1(String s, String s1) {
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys(s);
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys(s1);
		WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnlogin.click();
	}

	@Parameters({ "checkin", "checkout" })
	@Test
	private void test2(String d, String d1) throws InterruptedException {
		WebElement btnlocation = driver.findElement(By.xpath("//select[@id='location']"));
		DropDownSelectByIndex(btnlocation, 2);
		WebElement btnhotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		DropDownSelectByIndex(btnhotel, 3);
		WebElement btnroomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		DropDownSelectByIndex(btnroomtype, 2);
		WebElement btnnoodrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		DropDownSelectByIndex(btnnoodrooms, 2);
		WebElement txtcheckindate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		txtcheckindate.sendKeys(d);
		WebElement txtcheckoutdate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		txtcheckoutdate.sendKeys(d1);
		WebElement btnadultsperroom = driver.findElement(By.xpath("//select[@id='adult_room']"));
		DropDownSelectByIndex(btnadultsperroom, 2);
		WebElement btnchildrenperroom = driver.findElement(By.xpath("//select[@id='child_room']"));
		DropDownSelectByIndex(btnchildrenperroom, 3);
		WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='Submit']"));
		btnSubmit.click();
	}

	@Test
	private void test3() {
		WebElement btnClick = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		btnClick.click();
		WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
		btnContinue.click();
	}

	@Parameters({ "firstname", "lastname", "address", "creditcardno", "cvvnumber" })
	@Test
	private void test4(String c, String c1, String c2, String c3, String c4) {
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtFirstName.sendKeys(c);
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(c1);
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@id='address']"));
		txtaddress.sendKeys(c2);
		WebElement txtcreditcardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		txtcreditcardno.sendKeys(c3);
		WebElement creditcardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		DropDownSelectByIndex(creditcardtype, 2);
		WebElement expirydate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		DropDownSelectByIndex(expirydate, 3);
		WebElement selectyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		DropDownSelectByIndex(selectyear, 2);
		WebElement txtcvvnumber = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		txtcvvnumber.sendKeys(c4);
		WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
		booknow.click();
	}

	@Test
	private void test5() throws InterruptedException {
		Thread.sleep(9000);
		WebElement myititeray = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
		myititeray.click();
		Thread.sleep(4000);
		WebElement orderno = driver.findElement(By.xpath("//input[@id='order_id_410088']"));
		String attribute = orderno.getAttribute("value");
		System.out.println(attribute);
	}
	@AfterMethod
	private void screenshot(Method method) throws IOException {
		screenShot(method.getName());
	}
	@AfterClass
	private void BrowserClose() {
		quitBrowser();
	}
}
