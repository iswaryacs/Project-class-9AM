package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	Alert alert;
	public static void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
	public static void loadUrl(String url) {
		driver.get(url);
	}
	public void Wait() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void currentUrl() {
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void Date() {
			Date date= new Date();
			System.out.println(date);
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	public static void type(WebElement element, String Data) {
		element.sendKeys(Data);
		}
	public void type1(WebElement element, String Dataemail) {
		element.sendKeys(Dataemail);
		}
	public void type2(WebElement element, String Datapass) {
		element.sendKeys(Datapass);
		}
	public static void Click(WebElement element) {
	element.click();
	}
	public static void quitBrowser() {
		driver.quit();
		}
		public void closeBrowser() {
			driver.close();
		}
	public void ActionMoveToElements(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
	}
		public void ActionRightClick(WebElement element) {
		Actions action=new Actions(driver);
		action.contextClick().perform();
	}
		public void ActionDoubleClick(WebElement element) {
			Actions action=new Actions(driver);
			action.doubleClick().perform();
		}
		public void ActionDragAndDrop(WebElement source, WebElement target) {
			new Actions(driver).dragAndDrop(source, target);
		}
		public void SimpleAlert() {
			alert= driver.switchTo().alert();		
		}
		public void confimrAlert() {
		alert =driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		}
		public void promptAlert(String data) {
			alert=driver.switchTo().alert();
			alert.sendKeys("Yes");
			alert.accept();
			alert.dismiss();
		}
		public void AlertText() {
			alert= driver.switchTo().alert();
			String name = alert.getText();
			System.out.println(name);
		}
		public static void screenShot(String path) throws IOException {
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File sourceFile= screenshot.getScreenshotAs(OutputType.FILE);
			System.out.println(sourceFile);
			File destFile = new File(System.getProperty("user.dir")+"\\Screenshot\\"+path+".png");
			FileUtils.copyFile(sourceFile, destFile);
		}
		public static void ThreadSleep() throws InterruptedException {
			Thread.sleep(9000);
		}
		
		public void ScrollDown(WebElement element) {
			JavascriptExecutor exectutor = (JavascriptExecutor) driver;
			exectutor.executeScript("arguments[0].scrollIntoView(true)", element);	
			}
		public void ScrollUpPage(WebElement element) {
			JavascriptExecutor exectutor = (JavascriptExecutor) driver;
			exectutor.executeScript("arguments[0].scrollIntoView(false)", element);
			}
		
	public void RobotKeyBoard() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public void FrameWebElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	public void FramesSize(String iFrame) {
		List<WebElement> element = driver.findElements(By.tagName(iFrame));
		int size = element.size();
		System.out.println(size);
	}
	public void ParentFrameSwitch() {
		driver.switchTo().defaultContent();
	}
	public void DropDownGetOptions(WebElement element) {
		Select s= new Select(element);
		List<WebElement> allOptions = s.getOptions();
		int size = allOptions.size();
		System.out.println(size);
		for (int i = 0; i < allOptions.size(); i++) {
			WebElement webElement = allOptions.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}
	}
	public void DropDownAllSelectedOptions(WebElement element) {
		Select select= new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for (WebElement element1 : allSelectedOptions) {
			String text = element1.getText();
			System.out.println(text);
			
		}
	}
	public void DropDownFirstSelectedOptions(WebElement element) {
		Select select= new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}
	public static void DropDownSelectByIndex(WebElement element, int index) {
		Select s= new Select(element);
		s.selectByIndex(index);
	}
	public void DropDownSelectByValue(WebElement element, String value) {
		Select s= new Select(element);
		s.selectByValue(value);
	}
	public void DropDownSelectByVisibleText(WebElement element, String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	public void DropDownDeSelectByIndex(WebElement element, int index) {
		Select s= new Select(element);
		s.deselectByIndex(index);
	}
	public void DropDownDeSelectByValue(WebElement element, String value) {
		Select s= new Select(element);
		s.deselectByValue(value);
	}
	public void DropDownDeSelectByVisibleText(WebElement element, String text) {
		Select s= new Select(element);
		s.deselectByVisibleText(text);
	}
	public void DropDownDeSelectAll(WebElement element) {
		Select s= new Select(element);
		s.deselectAll();
	}
	public void DropDownIsMultiple(WebElement element) {
		Select s= new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public void VisibilityCheckisEnabled(WebElement element, String data) {
		if (element.isEnabled()) {
		element.sendKeys(data);
		}
		}
	public void isDisplayed(WebElement element) {
		 if (element.isDisplayed()) {
			 element.sendKeys("Welcome");
		}
		}
	public void VisibilityCheckisSelected(WebElement element) {
		element.click();
		if (element.isSelected()) {
		String text = element.getText();
		System.out.println(text);
		}
		}
	public WebElement LocatorByXpath(String Data) {
		  WebElement findElement = driver.findElement(By.xpath(Data));
		  return findElement;
		}
	public void WindowsHandling() {
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> AllWindowsId = driver.getWindowHandles();
		System.out.println(AllWindowsId);
		for (String eachId : AllWindowsId) {
			if (!parentId.equals(eachId)) {
				driver.switchTo().window(eachId);				
			}}
		//driver.switchTo().window(parentId);
	}
	public void WindowSwitchToParent() throws InterruptedException {
		String parentidpath = driver.getWindowHandle();
		System.out.println(parentidpath);
		ThreadSleep();
		driver.switchTo().window(parentidpath);
		}
	public String getDataFromExcel(String pathname, String sheetName, int rowNo, int cellNo) throws IOException {
		File file= new File(pathname);
		FileInputStream stream= new FileInputStream(file);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int cellType = c.getCellType();
		String value="";
		if (cellType==1) {
			value=c.getStringCellValue();
		}
		else if(DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat dateFormat= new SimpleDateFormat("dd-MM-yy");
			value=dateFormat.format(dateCellValue);
			}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l= (long) numericCellValue;
			value= String.valueOf(l);
			}
		return value;	
		}	
	public static void EnterDataFromExcel(WebElement element, String pathname, String excelname) throws IOException {
	File file= new File (pathname);
	Workbook w= new XSSFWorkbook();
	Sheet s = w.createSheet(excelname);
	Row r = s.createRow(0);
	Cell c = r.createCell(0);
	String attribute = element.getAttribute("value");
	c.setCellValue(attribute);
	FileOutputStream f= new FileOutputStream(file);
	w.write(f);	
	}
}


	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	/*public void selectValueByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);
	}
	public void selectValueByText(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);
	}
	*/
	