package Mypackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Selenium_DDD_R_W {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		String Path = "E:\\Selenium.xlsx";
		File file = new File(Path);
		try
		   {
		       FileOutputStream fos = new FileOutputStream(file);		       
		       workbook = new XSSFWorkbook();
		       sheet = workbook.createSheet();
		       XSSFRow myRow = sheet.createRow(0);
		       XSSFCell cell = myRow.getCell(0);
		           if(cell==null)
		               {
		                   cell = myRow.createCell(0);
		                   cell.setCellValue("ABC");    
		               }
		           else
		               {
		                   cell.setCellValue("123");        
		               }
		       workbook.write(fos);//Following code is to write the output file on defined location.
		       fos.flush();
		       fos.close();
		   }
		catch(IOException e)
		   {
		       System.out.println(e);
		   }
	}


}

