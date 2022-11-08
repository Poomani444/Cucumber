package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void write() throws IOException {

		File f = new File("C:\\Users\\monis\\Desktop\\Flower.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		// Sheet createSheet = wb.createSheet("Employee Details");
		// Row createRow = createSheet.createRow(0);
		// Cell createCell = createRow.createCell(0);
		// createCell.setCellValue("User_Name");

		
		wb.createSheet("Employee Details1").createRow(0).createCell(0).setCellValue("User_Name");
		wb.getSheet("Employee Details1").getRow(0).createCell(1).setCellValue("Password");
		wb.getSheet("Employee Details1").createRow(1).createCell(0).setCellValue("Poomani");
		wb.getSheet("Employee Details1").getRow(1).createCell(1).setCellValue("flower1234");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("Write succesfully");
		
		wb.close();

	}

	public static void main(String[] args) throws IOException {
		write();
	}

}