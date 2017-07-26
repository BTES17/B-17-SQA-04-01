package Selenium_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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
	public  String path;
	public  FileInputStream fis = null;
	public  FileOutputStream fileOut =null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	private XSSFRow row   =null;
	private XSSFCell cell = null;
	WebDriver driver;
	public void excel() throws IOException
		{		
			fis = new FileInputStream("E:\\TestScript2.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("TestData");
				for(int count = 1; count <= sheet.getLastRowNum(); count++)
					{
						row = sheet.getRow(count);
						System.out.println("Running test case " + row.getCell(0).toString());
						// Run the test for the current test data row
						login(row.getCell(1).toString(),row.getCell(2).toString());
					}	
		}
	public void login(String strusername, String strpassword)
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
			System.out.println("Login successfully");
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
	public static void main(String[] args) throws IOException 
		{
			// TODO Auto-generated method stub
			Login_Complete_Sample obj = new Login_Complete_Sample();
			obj.setupFireFox();
			obj.excel();					
		}
}
