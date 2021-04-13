package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MavenDay1Sample {
public static void main(String[] args) throws IOException {
	File file = new File("C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\Excel sheet\\MavenTask.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook w= new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Sheet1");
	
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell cell = r.getCell(j);
			int type = cell.getCellType();
			if(type==1) {
				String name = cell.getStringCellValue();
				System.out.println(name);
			}
			if (type==0) {
				if(DateUtil.isCellDateFormatted(cell)) {
					String name= new SimpleDateFormat("dd-MMM-yy").format(cell.getDateCellValue());
					System.out.println(name);
				}
					else {
						String name = String.valueOf((long)cell.getNumericCellValue());
						System.out.println(name);
					}
				}
			}
		
}
}
}