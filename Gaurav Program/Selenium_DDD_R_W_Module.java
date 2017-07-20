package Mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Selenium_DDD_R_W_Module {
XSSFWorkbook workbook;
XSSFSheet sheet;
XSSFRow row;
XSSFCell cell;
String path = "E:\\Selenium_DDD_R_W_Module.xlsx";
FileOutputStream fos=null;
FileInputStream fis=null;
File file;
Selenium_DDD_R_W_Module() throws IOException
	{	
		file = new File(path);
		fos = new FileOutputStream(file);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook();
		sheet = workbook.createSheet();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Selenium_DDD_R_W_Module obj = new Selenium_DDD_R_W_Module();
		obj.setCellData("Gaurav",0,0);
		obj.getCellData(0,0);
	}
	public String getCellData(int rownum, int colnum)
	{
		// TODO Auto-generated method stub
		
		cell = row.getCell(colnum, Row.RETURN_BLANK_AS_NULL);
			if(cell==null)
				{
					System.out.println("cell not exist");
					return null;
				}
			else
				{
					System.out.println(cell.getStringCellValue().trim());
					return cell.getStringCellValue().trim();
				}
	}
	public void setCellData(String result, int rownum, int colnum) throws IOException 
	{
		// TODO Auto-generated method stub
		row = sheet.createRow(rownum);
		cell = row.getCell(colnum, Row.RETURN_BLANK_AS_NULL);
			if(cell==null)
				{
					cell=row.createCell(colnum);
					cell.setCellValue(result);
				}
			else
				{
					cell.setCellValue(result);
					System.out.println(cell.getStringCellValue());
				}
			workbook.write(fos);
			fos.flush();
			fos.close();
	}
}
