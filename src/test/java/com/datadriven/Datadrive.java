package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.compress.utils.Lists;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrive {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\Maven\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			List<HashMap<String,String>> listData=new ArrayList<HashMap<String,String>>();
			File f = new File("C:\\Users\\Sony\\eclipse-workspace\\Maven\\Library\\Datadriven.xlsx");
			FileInputStream fin = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fin);
			Sheet Sheet =w.getSheet("Sheet1");
			Row header = Sheet.getRow(0);
			Sheet.getRow(0).createCell(3).setCellValue("FirstName");
			
			for (int i = 0; i <Sheet.getPhysicalNumberOfRows(); i++) {
				HashMap<String,String>mapdata= new HashMap<String,String>();
				Row row = Sheet.getRow(i);
				
				for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				 Cell Cell =  row.getCell(j);
				 CellType cellType = Cell.getCellType();
				 
				 if (cellType == CellType.STRING) {
					String String = Cell.getStringCellValue();
					mapdata.put(header.getCell(j).getStringCellValue(), String);
				}else if (cellType == CellType.NUMERIC) {
					double numericCellValue = Cell.getNumericCellValue();
					long l =(long) numericCellValue;
					String valueOf = String.valueOf(i);
					mapdata.put(header.getCell(j).getStringCellValue(), valueOf);
				}
				 
				 
				}
				
				listData.add(mapdata);
			}
			
			FileOutputStream fout = new FileOutputStream(f);
			w.write(fout);
			fout.close();
			
			System.out.println(listData.get(1).get("Username"));
			System.out.println(listData.get(2).get("password"));
			
			driver.findElement(By.id("email")).sendKeys(listData.get(1).get("Username"));
			driver.findElement(By.id("pass")).sendKeys(listData.get(2).get("password"));
			
			
			
		}
}
 