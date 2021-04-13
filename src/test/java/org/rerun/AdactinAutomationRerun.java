package org.rerun;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class AdactinAutomationRerun extends BaseClass{
	@Test
	private void test1() {
		getDriver();
		loadUrl("https://www.adactinhotelapp.com/");
		maximize();
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("reach2ishu03");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtPassword.sendKeys("vaishali");
		WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login']"));
		btnlogin.click();
	}
@Test
private void test2() throws InterruptedException {
	WebElement btnlocation = driver.findElement(By.xpath("//select[@id='location']"));
	DropDownSelectByIndex(btnlocation, 2);
	WebElement btnhotel = driver.findElement(By.xpath("//select[@id='hotels']"));
	DropDownSelectByIndex(btnhotel, 3);
	WebElement btnroomtype = driver.findElement(By.xpath("//select[@id='room_type']"));
	DropDownSelectByIndex(btnroomtype, 2);
	WebElement btnnoodrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
	DropDownSelectByIndex(btnnoodrooms, 2);
	WebElement txtcheckindate = driver.findElement(By.xpath("//input[@id='datepick_in']"));
	txtcheckindate.sendKeys("10/04/2021");
	WebElement txtcheckoutdate = driver.findElement(By.xpath("//input[@id='datepick_out']"));
	txtcheckoutdate.sendKeys("11/04/2021");
	WebElement btnadultsperroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
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

@Test
private void test4() {
	WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
	txtFirstName.sendKeys("Iswarya");
	WebElement txtLastName = driver.findElement(By.id("last_name"));
	txtLastName.sendKeys("Subramanian");
	WebElement txtaddress = driver.findElement(By.xpath("//textarea[@id='address']"));
	txtaddress.sendKeys("nanganallur");
	WebElement txtcreditcardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
	txtcreditcardno.sendKeys("7890765432678909");
	WebElement creditcardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	DropDownSelectByIndex(creditcardtype, 2);
	WebElement expirydate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	DropDownSelectByIndex(expirydate, 3);
	WebElement selectyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	DropDownSelectByIndex(selectyear, 2);
	WebElement txtcvvnumber = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	txtcvvnumber.sendKeys("369");
	WebElement booknow = driver.findElement(By.xpath("//input[@id='book_now']"));
	booknow.click();
}

@Test
private void test5() throws InterruptedException {
	//Thread.sleep(9000);
	WebElement myititeray = driver.findElement(By.xpath("//input[@id='my_itinerary']"));
	myititeray.click();
	//Thread.sleep(4000);
	WebElement orderno = driver.findElement(By.xpath("//input[@id='order_id_410088']"));
	String attribute = orderno.getAttribute("value");
	System.out.println(attribute);
}
}
