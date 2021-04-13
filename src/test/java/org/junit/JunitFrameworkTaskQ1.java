package org.junit;

import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JunitFrameworkTaskQ1 {
	static WebDriver driver;
	@BeforeClass
	public static void browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	Assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
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
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("Iswarya");
	Assert.assertEquals("Iswarya", txtUserName.getAttribute("value"));
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Welcome");
	Assert.assertEquals("Welcome", txtPassword.getAttribute("value"));
	//WebElement btnLogin = driver.findElement(By.name("login"));
	//btnLogin.click();
}
}
