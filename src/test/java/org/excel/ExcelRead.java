package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelRead {
public static void main(String[] args) throws IOException, InterruptedException {
	//To locate the file
	File f=new File("C:\\Excel\\ExcelRead.xlsx");
	//To locate the file in the field
	FileInputStream f1=new FileInputStream(f);
	//To define format of Excel
	Workbook w=new XSSFWorkbook(f1);
	//To get the sheet
	Sheet sheet = w.getSheet("Family");
	for(int i=0;i<sheet.getPhysicalNumberOfRows();i++) {
		Row row = sheet.getRow(i);
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			Cell cell = row.getCell(j);
			String stringCellValue = cell.getStringCellValue();
			if(stringCellValue.equalsIgnoreCase("star@gmail.com")) {
				cell.setCellValue("Test@gmail.com");
				FileOutputStream f2=new FileOutputStream(f);
				w.write(f2);
			}
		}
	}
	

		}
	}
	
