package org.extentreport;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReporthtml {
ExtentReports reports;
ExtentHtmlReporter htmlReporter;
WebDriver driver;
ExtentTest extentTest;

@BeforeClass
public void beforeClassmethod() {
	reports = new ExtentReports();
	htmlReporter= new ExtentHtmlReporter("extentreport.html");
	reports.attachReporter(htmlReporter);
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.adactinhotelapp.com/");
}
@AfterClass
public void afterClass() {
	driver.close();
	reports.flush();
}
@Test
public void tc0() {
	extentTest = reports.createTest("login Adactin Application");
	extentTest.log(Status.INFO, "Login Adactin Application by Valid UserName");
	extentTest.log(Status.INFO, "Verify adactin URL");
	if (driver.getCurrentUrl().contains("adactin")) {
	extentTest.log(Status.PASS, "Url is Valid");	
	}
	else {
	extentTest.log(Status.FAIL, "Inalid Url");
	}
	
}
@Test
private void tc1() throws IOException {
	extentTest= reports.createTest("Entering Username values in Adactin");
	extentTest.log(Status.INFO, "Verifying UserName textbox is enabled");
	WebElement txtUserName = driver.findElement(By.id("username"));
	if (txtUserName.isEnabled() && txtUserName.isDisplayed()) {
	extentTest.log(Status.PASS, "Username is enabled");
	txtUserName.sendKeys("reach2ishu03");
	File screenshotAs = txtUserName.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("Adactin Page Username.png"));
	extentTest.addScreenCaptureFromPath("Adactin Page.png");
	}
	extentTest.log(Status.INFO, "Verifying password textbox is enabled");
	WebElement txtPassword = driver.findElement(By.id("password"));
	if (txtPassword.isEnabled() && txtPassword.isDisplayed()) {
	extentTest.log(Status.PASS, "Password is enabled");
	txtPassword.sendKeys("vaishali");
	File screenshotAs = txtPassword.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotAs, new File("Adactin Page Password.png"));
	extentTest.addScreenCaptureFromPath("Adactin Page Password.png");
	}
	extentTest.log(Status.INFO, "Verifying login is enabled");
	WebElement btnlogin = driver.findElement(By.xpath("//input[@id='login']"));
	if (btnlogin.isEnabled() && btnlogin.isDisplayed()) {
	extentTest.log(Status.PASS, "Login is enabled");
	btnlogin.click();
	
	TakesScreenshot screenshot= (TakesScreenshot) driver;
	File loc= screenshot.getScreenshotAs(OutputType.FILE);
	File des= new File("Adactin page login.png");
	FileUtils.copyFile(loc, des);
	extentTest.addScreenCaptureFromPath("Adactin Page login.png");
	}
}
}

