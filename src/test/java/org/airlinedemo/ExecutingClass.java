package org.airlinedemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.base.BaseClass;

public class ExecutingClass extends BaseClass {
	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	ExtentTest extentTest;
	
	@BeforeClass
	private void beforeClass() throws InterruptedException {
		reports=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter("ExtentReportBlazeDemo.html");
		reports.attachReporter(htmlReporter);
		getDriver();
		loadUrl("https://blazedemo.com/");
		maximize();
		Wait();

	}

	@BeforeMethod
	private void beforeMethod() {
		Date();
	}

	@Parameters({ "deppart", "dest" })
	@Test(priority = 1)
	private void testcase1city(int i, int ii) throws IOException {
		extentTest=reports.createTest("login Blazedemo Application");
		extentTest.log(Status.INFO, "Verify Blaze Url");
		if (driver.getCurrentUrl().contains("blaze")) {
			extentTest.log(Status.INFO, "url is valid");
		}
		extentTest = reports.createTest("Entering Depart and Destination");
		extentTest.log(Status.INFO, "Verifying The City Entered in the Text box");
		ChooseFlightTask1 cf = new ChooseFlightTask1();
		//DropDownSelectByIndex(cf.getFromPort(), i);
		WebElement fromPort = cf.getFromPort();
		if (fromPort.isEnabled()) {
			extentTest.log(Status.INFO, "Depart Field is enabled");
			DropDownSelectByIndex(fromPort, i);
		}
		//DropDownSelectByIndex(cf.getToPort(), ii);
		WebElement toPort = cf.getToPort();
		if (toPort.isEnabled() ) {
			extentTest.log(Status.INFO, "Destination Field is enabled");
			DropDownSelectByIndex(toPort, ii);
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("testcase1airline.png"));
			extentTest.addScreenCaptureFromPath("testcase1airline.png");

		}
		//Click(cf.getBtnSubmit());
		WebElement btnSubmit = cf.getBtnSubmit();
		if (btnSubmit.isDisplayed()) {
			extentTest.log(Status.INFO, "Submit Button is Displayed");
			Click(btnSubmit);
			
			
		}
	}

	@Test(priority = 2)
	private void testcase2ChooseFlights() throws IOException {
		extentTest = reports.createTest("Choose the Flights");
		extentTest.log(Status.INFO, "Verifying The Choose Flight is clickable");
		SelectFlightTask2 sf = new SelectFlightTask2();
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("testcase2airline.png"));
		extentTest.addScreenCaptureFromPath("testcase2airline.png");
		//Click(sf.getBtnChooseThisFlight());
		WebElement btnChooseThisFlight = sf.getBtnChooseThisFlight();
		if (btnChooseThisFlight.isDisplayed()) {
			extentTest.log(Status.INFO, "choosetheflight Button is Displayed");
			Click(btnChooseThisFlight);
		}
	}

	@Parameters({ "name", "address", "city", "state", "zipcode", "cardnumber", "cardmonth", "cardyear", "nameoncard" })
	@Test(priority = 3)
	private void testCase3Register(String name, String address, String city, String state, String zipcode,
			String cardnumber, String cardmonth, String cardyear, String nameoncard) throws InterruptedException, IOException {
		extentTest = reports.createTest("Entering the passenger details");
		extentTest.log(Status.INFO, "Verifying The passenger details is entered in textbox");
		EnterDetailsTask3 Details = new EnterDetailsTask3();
		//type(Details.getEnterName(), name);
		WebElement enterName = Details.getEnterName();
		if (enterName.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the name text box is displayed");
			type(enterName, name);
		}
		//type(Details.getEnteraddress(), address);
		WebElement enteraddress = Details.getEnteraddress();
		if (enteraddress.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the address text box is displayed");
			type(enteraddress, address);
		}
		//type(Details.getEntercity(), city);
		WebElement entercity = Details.getEntercity();
		if (entercity.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the city text box is displayed");
			type(entercity, city);
		}
		//type(Details.getEnterstate(), state);
		WebElement enterstate = Details.getEnterstate();
		if (enterstate.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the state text box is displayed");
			type(enterstate, state);
		}
		//type(Details.getEnterzipcode(), zipcode);
		WebElement enterzipcode = Details.getEnterzipcode();
		if (enterzipcode.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the zip code text box is displayed");
			type(enterzipcode, zipcode);
		}
		//DropDownSelectByIndex(Details.getEntercardtype(), 1);
		WebElement entercardtype = Details.getEntercardtype();
		if (entercardtype.isEnabled()) {
			extentTest.log(Status.INFO, "cardtype is enabled");
			DropDownSelectByIndex(entercardtype, 0);
		}
		//type(Details.getEntercreditcardnumber(), cardnumber);
		WebElement entercreditcardnumber = Details.getEntercreditcardnumber();
		if (entercreditcardnumber.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the cardnumber text box is displayed");
			type(entercreditcardnumber, cardnumber);
		}
		//type(Details.getEntercreditcardmonth(), cardmonth);
		WebElement entercreditcardmonth = Details.getEntercreditcardmonth();
		if (entercreditcardmonth.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the card month text box is displayed");
			type(entercreditcardmonth, cardmonth);
		}
		//type(Details.getEntercreditcardyear(), cardyear);
		WebElement entercreditcardyear = Details.getEntercreditcardyear();
		if (entercreditcardyear.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the card year text box is displayed");
			type(entercreditcardyear, cardyear);
		}
		//type(Details.getEnternameoncard(), nameoncard);
		WebElement enternameoncard = Details.getEnternameoncard();
		if (enternameoncard.isDisplayed()) {
			extentTest.log(Status.INFO, "Entering the name on card text box is displayed");
			type(enternameoncard, nameoncard);
			TakesScreenshot screenshot=(TakesScreenshot)driver;
			File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotAs, new File("testcase3airline.png"));
			extentTest.addScreenCaptureFromPath("testcase3airline.png");
		}
		//Click(Details.getEnterRememberMe());
		WebElement enterRememberMe = Details.getEnterRememberMe();
		if (enterRememberMe.isDisplayed()) {
			extentTest.log(Status.INFO, "EnterRememberMe is displayed");
			Click(enterRememberMe);
		}
		//Click(Details.getBtnsubmit());
		WebElement btnsubmit = Details.getBtnsubmit();
		if (btnsubmit.isDisplayed()) {
			extentTest.log(Status.INFO, "Sumbit is displayed");
			Click(btnsubmit);
			
		}
	}

	@Test(priority = 4)
	private void testCasePassengerId() throws IOException {
		OrderIdTask4 ot = new OrderIdTask4();
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("testcase4airline.png"));
		extentTest.addScreenCaptureFromPath("testcase4airline.png");
		getText(ot.getOrderId());
	}

	@AfterMethod
	private void aftermethod() {
		Date();

	}

	@AfterClass
	private void afterclass() {
		closeBrowser();
		reports.flush();
	}
}
