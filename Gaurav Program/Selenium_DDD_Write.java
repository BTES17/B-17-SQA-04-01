package Mypackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Selenium_DDD_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String dest="D:\\testexcel221.xlsx";
		   XSSFWorkbook myWorkBook = new XSSFWorkbook();
		   XSSFSheet mySheet = myWorkBook.createSheet();
		   XSSFRow myRow = mySheet.createRow(0);
		   XSSFCell   myCell = myRow.createCell((short) 0);
		   myCell.setCellValue("1111");    		   
		   FileOutputStream out = new FileOutputStream(dest);
		       myWorkBook.write(out);
		       out.close();
	}

}
