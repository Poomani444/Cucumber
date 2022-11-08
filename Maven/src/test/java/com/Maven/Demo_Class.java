package test.java.com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo_Class {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("C:\\Users\\monis\\Desktop\\Flower.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);		
		
	}
	
}


