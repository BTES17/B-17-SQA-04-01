package ISHAAN1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Actions.Login;
import Repository.LoginPage;
import Repository.LogoutPage;

public class Apache extends Hls_Reader
{

	public Apache(String path) 
	{
		super(path);
		
	}
public static void main(String arg[]) throws IOException
{
//	Map<String,Object> pr= new HashMap<String, Object>();
//	pr.put("profile.default_content_setting_values.notifications", 2);
//	ChromeOptions op= new ChromeOptions();
//	op.setExperimentalOption("prefs", pr);
//	
//	
//		String url="C:\\Documents and Settings\\install\\Desktop\\Selenium\\chromedriver.exe";
		//Hls_Reader datatable = new Hls_Reader("C:\\Documents and Settings\\install\\Desktop\\Ishaan.xls");
//      
//        System.setProperty("webdriver.chrome.driver",url);
//		WebDriver driver=new ChromeDriver(op);
//		driver.get("https://wwww.facebook.com");

		//WebElement UN=driver.findElement(By.id("email"));
	Login.setup();
	
//		WebElement UN=LoginPage.getFieldUsername(driver);
//		String id=datatable.getCellData("Sheet1","UN",2);
//		UN.sendKeys(id);
//		
//		
//		//WebElement PW=driver.findElement(By.id("pass"));
//		WebElement PW=LoginPage.getFieldPassword(driver);
//		String pass=datatable.getCellData("Sheet1","PW",2);
//		PW.sendKeys(pass);
//
//		//WebElement LoginButton=driver.findElement(By.id("loginbutton"));
//		WebElement LoginButton=LoginPage.LoginClick(driver);
//		LoginButton.click();
	Login.Testcase();
//		
//			
//			
//			WebDriver driver=new ChromeDriver(op);
		//Alert Alert=driver.switchTo().alert();
	
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_b")));
//		
//		String Result=driver.getCurrentUrl();
//		System.out.println(Result);
//		WebElement NavigationButton=LogoutPage.NavigationButton(driver);
//		NavigationButton.click();
//		
//		WebElement Logout=LogoutPage.Logout(driver);
//		Logout.click();
//		String Expected=datatable.getCellData("Sheet1","Expected Result",2);
//		System.out.println(Result);
//		
//		if(Result.equals(Expected))
//		{
//			datatable.setCellData("Sheet1", "Actual Result", 2, "PASS");
//			System.out.println("PASS");
//			
//		}
//		else{
//			datatable.setCellData("Sheet1", "Actual Result", 2, "FAIL");
//		System.out.println("FAIL");
//		}
//		

//	}
	Login.Result();
}
}

