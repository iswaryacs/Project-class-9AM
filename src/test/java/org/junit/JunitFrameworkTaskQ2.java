package org.junit;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitFrameworkTaskQ2 {
	static WebDriver driver;
	@BeforeClass
	public static void redBusSample() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	//Assert.assertTrue(driver.getCurrentUrl().contains("CONVENIENCE ON"));
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
public void redBus() throws InterruptedException {
	WebElement btnElement = driver.findElement(By.xpath("//div[@id='select_box_sign']"));
	btnElement.click();
	WebElement btnSignIn = driver.findElement(By.xpath("//li[@id='signInLink']"));
	btnSignIn.click();
	WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
	driver.switchTo().frame(iFrame);
	Thread.sleep(5000);
	WebElement txtenterPhno = driver.findElement(By.id("mobileNoInp"));
	txtenterPhno.sendKeys("9790799865");
	//Assert.assertEquals("97980799865", txtenterPhno.getAttribute("value"));
	
	
			
	//WebElement txtUserName = driver.findElement(By.id("email"));
	//txtUserName.sendKeys("Iswarya");
	//Assert.assertEquals("Iswarya", txtUserName.getAttribute("value"));
	//WebElement txtPassword = driver.findElement(By.id("pass"));
	//txtPassword.sendKeys("Welcome");
	//Assert.assertEquals("Welcome", txtPassword.getAttribute("value"));
	//WebElement btnLogin = driver.findElement(By.name("login"));
	//btnLogin.click();
}
}

