package Mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Selenium_DDD {

public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	String path = "E:\\Sample.xlsx";
	File file=new File(path);
		/*FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file);
		sample = new XSSFWorkbook();
		sheet=sample.createSheet();
		Row row=sheet.createRow(1);
		Cell cell=row.createCell(1);
		if (cell == null) 
			{
				cell = row.createCell(1);
				cell.setCellValue("ABC");
			} 
		else 
			{
				cell.setCellValue("123");
			}
		sample.write(fos);
		fos.close();
		fos.flush();
		fis.close();*/		
		FileInputStream fis = new FileInputStream(path);
		FileOutputStream fos = new FileOutputStream(path);
		workbook = new XSSFWorkbook();
		//int num = sample.getActiveSheetIndex();
		sheet = workbook.createSheet();
		/*XSSFCell cell = sheet.createRow(0).getCell(0);
		if(cell==null)
			{
				System.out.println("No such cell exist");
			}
		else
			{
				cell.setCellValue("Yahoo");
			}*/
		//Create First Row
				XSSFRow row1 = sheet.createRow(0);
				XSSFCell r1c1 = row1.createCell(0);
				r1c1.setCellValue("Emd Id");
				XSSFCell r1c2 = row1.createCell(1);
				r1c2.setCellValue("NAME");
				XSSFCell r1c3 = row1.createCell(2);
				r1c3.setCellValue("AGE");
				//Create Second Row
				XSSFRow row2 = sheet.createRow(1);
				XSSFCell r2c1 = row2.createCell(0);
				r2c1.setCellValue("1");
				XSSFCell r2c2 = row2.createCell(1);
				r2c2.setCellValue("Ram");
				XSSFCell r2c3 = row2.createCell(2);
				r2c3.setCellValue("20");		
				//Create Third Row
				XSSFRow row3 = sheet.createRow(2);
				XSSFCell r3c1 = row3.createCell(0);
				r3c1.setCellValue("2");
				XSSFCell r3c2 = row3.createCell(1);
				r3c2.setCellValue("Shyam");
				XSSFCell r3c3 = row3.createCell(2);
				r3c3.setCellValue("25");
		workbook = new XSSFWorkbook (fis);
		sheet = workbook.getSheetAt(0);
		Iterator ite = sheet.rowIterator();
		while(ite.hasNext()){
			XSSFRow row = (XSSFRow) ite.next();
			Iterator<Cell> cite = row.cellIterator();
			while(cite.hasNext()){
				XSSFCell c = (XSSFCell) cite.next();
				System.out.print(c.toString() +"  ");
			}
			System.out.println();
		}
		fis.close();
		workbook.write(fos);
		fos.close();
		fos.flush();	
		
	
	}

}
