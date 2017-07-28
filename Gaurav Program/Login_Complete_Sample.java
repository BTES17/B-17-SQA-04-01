package Selenium_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Complete_Sample {
	//public String path = "E:\\TestScript2.xlsx";
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	WebDriver driver;
	int count;
	Login_Complete_Sample() throws IOException
		{
			fis = new FileInputStream("E:\\TestScript2.xlsx");
			//fos = new FileOutputStream("E:\\TestScript2.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("TestData");
		}
	public void excel() throws IOException
		{						
			for(count = 1; count <= sheet.getLastRowNum(); count++)
				{
					row = sheet.getRow(count);
					System.out.println("Running test case " +row.getCell(0).toString());
					//Run the test for the current test data row
					getBrowser(row.getCell(3).toString());
					login(row.getCell(1).toString(),row.getCell(2).toString());						
				}	
		}	
	public void getBrowser(String browser) 
		{
		// TODO Auto-generated method stub
			if(browser.equals("Mozilla"))
				{
					setupFireFox();
				}
			else
				{
					setupChrome();
				}			
		}
	public void login(String strusername, String strpassword) throws IOException
		{	
			driver.navigate().to("https://reportstesting1.tk20.com");
			//Implecit_Wait.imp_wait(Setup.driver);//PO
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("user")).clear();
			driver.findElement(By.id("user")).sendKeys(strusername);				
			driver.findElement(By.id("pass")).clear();
			(new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
			driver.findElement(By.id("pass")).sendKeys(strpassword);	
			driver.findElement(By.name("login2")).click();
			System.out.println("'" +row.getCell(0).toString()+ "' Login successfully.");
			//setData(1, 4, "pass");
			System.out.println("Expected Title: " +driver.getTitle());
			System.out.println("Actual Title: " +sheet.getRow(count).getCell(4));
				if(driver.getTitle().equals(sheet.getRow(count).getCell(4).getStringCellValue()))
					{
						setData(sheet.getRow(count).getRowNum(), 5, "pass");
						System.out.println("As the expected title i.e. '" +driver.getTitle()+  "' is same with actual title i.e. '" +sheet.getRow(count).getCell(4).getStringCellValue()+ "' so, result is Pass.");
					}
				else
					{
						setData(sheet.getRow(count).getRowNum(), 5, "Fail");
						System.out.println("As the expected title i.e. '" +driver.getTitle()+  "' is not same with actual title i.e. '" +sheet.getRow(count).getCell(4).getStringCellValue()+ "' so, result is Fail.");
					}
		}
	public void setData(int rownum, int colnum, String string) throws IOException 
		{
			/*// TODO Auto-generated method stub
			cell = sheet.getRow(rownum).getCell(colnum, Row.RETURN_BLANK_AS_NULL);			
			cell.setCellValue(string);*/
			row  = sheet.getRow(rownum);
			cell = row.getCell(colnum, row.RETURN_BLANK_AS_NULL);		     
		         if(cell==null)
		             {
		                  cell=row.createCell(colnum);		                   
		                  cell.setCellValue(string);
		                  System.out.println("Result is '" +cell.getStringCellValue()+ "'.");
		             }
		         else
		             {
		                 cell.setCellValue(string);
		                 System.out.println("Result is '" +cell.getStringCellValue()+ "'.");
		             }
			close();
		}
	public void setupFireFox()
		{	
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("Browser launch");
		}
	public void setupChrome()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Browser launch");
		}
	public void close() throws IOException
	{
		fos = new FileOutputStream("E:\\TestScript2.xlsx");
		workbook.write(fos);
		fos.flush();
	}
	public static void main(String[] args) throws IOException 
		{
			// TODO Auto-generated method stub
			Login_Complete_Sample obj = new Login_Complete_Sample();
			//obj.setupFireFox();
			obj.excel();
		}
}
