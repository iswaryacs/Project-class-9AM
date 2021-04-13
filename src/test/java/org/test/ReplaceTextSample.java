package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReplaceTextSample {
	public static void main(String[] args) throws IOException {
		File file= new File("C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\Excel sheet\\Sample.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w= new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(2);
		Cell c = r.getCell(1);
		String name = c.getStringCellValue();
		if (name.equals("Selenium")) {
			c.setCellValue("Cloud");
		}
		FileOutputStream o= new FileOutputStream(file);
		w.write(o);
		System.out.println("Finished");
	}

}
