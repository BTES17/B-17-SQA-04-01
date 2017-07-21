package Mypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Login_Excel {
	String username = null;
    String password = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String username = null;
	    String password = null;		
String path = "E://Selenium_login_from_Excel.xlsx";
FileInputStream fis = new FileInputStream(path);
XSSFWorkbook workbook = new XSSFWorkbook(fis);
XSSFSheet sheet;
sheet = workbook.getSheet("Sheet1");
XSSFRow row = sheet.getRow(1);
XSSFCell cell1 = row.getCell(0);
XSSFCell cell2 = row.getCell(1);
username = cell1.toString();
password = cell2.toString();
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
WebDriver d =new FirefoxDriver();
d.get("http://reportstesting1.tk20.com");
d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
d.findElement(By.id("user")).clear();
d.findElement(By.id("user")).sendKeys(username);				
d.findElement(By.id("pass")).clear();
(new WebDriverWait(d, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
d.findElement(By.id("pass")).sendKeys(password);
d.findElement(By.name("login2")).click();	
	}

}
