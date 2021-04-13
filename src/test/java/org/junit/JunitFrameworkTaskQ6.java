package org.junit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFrameworkTaskQ6 {
	static WebDriver driver;
	@BeforeClass
	public static void adactinHotel() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("http://www.adactin.com/HotelApp/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Assert.assertTrue(driver.getCurrentUrl().contains("adactin"));
	}
	@Before
	public void beforeMethod() {
		Date date=new Date();
	System.out.println(date);
}
	@After
	public void afterMethod() {
		Date date=new Date();
		System.out.println(date);
	}
	@AfterClass
	public static void close() {
	//driver.close();
}
@Test
public void test1() {
	WebElement txtUserName = driver.findElement(By.id("username"));
	txtUserName.sendKeys("reach2ishu03");
	Assert.assertEquals("reach2ishu03", txtUserName.getAttribute("value"));
	WebElement txtPassword = driver.findElement(By.id("password"));
	txtPassword.sendKeys("vaishali");
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	}

}
