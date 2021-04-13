package org.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationExcel {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s= new Select(country);
		List<WebElement> options = s.getOptions();
		
		File file= new File("C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\Excel sheet\\MavenTask.xlsx");
		Workbook w= new XSSFWorkbook();
		Sheet s1 = w.createSheet("country");
		for (int i = 0; i < options.size(); i++) {
			Row r = s1.createRow(i);
			Cell c = r.createCell(0);
			c.setCellValue(options.get(i).getText());
		}
		FileOutputStream o= new FileOutputStream(file);
		w.write(o);
		System.out.println("Finished");
	
	}

}
