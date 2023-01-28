package org.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		//To locate the file where we can write.
		File f=new File("C:\\Excel\\ExcelWrite.xlsx");
		//To create new workbook
		Workbook w=new XSSFWorkbook();
		//To create new sheet
		Sheet s = w.createSheet("Family");
		//To create new row
		Row r = s.createRow(0);
		//To create new cell
		Cell c = r.createCell(0);
		//to update the value in excel.
		c.setCellValue("Java");
		FileOutputStream out=new FileOutputStream(f);
		//To write the setcell value in newly create file.
		w.write(out);

	}

}
