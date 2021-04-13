package org.junit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFrameworkTaskQ4 {
	static WebDriver driver;
	@BeforeClass
	public static void browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/account/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Assert.assertTrue(driver.getCurrentUrl().contains("flipkart"));
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
	WebElement txtEmail = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtEmail.sendKeys("Iswarya");
	Assert.assertEquals("Iswarya", txtEmail.getAttribute("value"));
	WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password']"));
	txtPassword.sendKeys("Welcome");
	Assert.assertEquals("Welcome", txtPassword.getAttribute("value"));
	//WebElement btnLogin = driver.findElement(By.name("login"));
	//btnLogin.click();
}
}
