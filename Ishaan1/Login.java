package Actions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ISHAAN1.Hls_Reader;
import Repository.LoginPage;
import Repository.LogoutPage;

public class Login 
{
	static Hls_Reader datatable = new Hls_Reader("C:\\Documents and Settings\\install\\Desktop\\Ishaan.xls");
	static WebDriver driver;
	public static void setup()
	{
	Map<String,Object> pr= new HashMap<String, Object>();
	pr.put("profile.default_content_setting_values.notifications", 2);
	ChromeOptions op= new ChromeOptions();
	op.setExperimentalOption("prefs", pr);
	
	
		String url="C:\\Documents and Settings\\install\\Desktop\\Selenium\\chromedriver.exe";
		 //datatable = new Hls_Reader("C:\\Documents and Settings\\install\\Desktop\\Ishaan.xls");
      
        System.setProperty("webdriver.chrome.driver",url);
	    driver=new ChromeDriver(op);
		driver.get("https://wwww.facebook.com");
}
public static void Testcase()
{
	WebElement UN=LoginPage.getFieldUsername(driver);
	String id=datatable.getCellData("Sheet1","UN",2);
	System.out.println(UN);
	UN.sendKeys(id);
	
	
	//WebElement PW=driver.findElement(By.id("pass"));
	WebElement PW=LoginPage.getFieldPassword(driver);
	String pass=datatable.getCellData("Sheet1","PW",2);
	System.out.println(PW);
	PW.sendKeys(pass);

	//WebElement LoginButton=driver.findElement(By.id("loginbutton"));
	WebElement LoginButton=LoginPage.LoginClick(driver);
	LoginButton.click();
}
public static void Result()
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_b")));
	
	String Result=driver.getCurrentUrl();
	System.out.println(Result);
//	WebElement NavigationButton=LogoutPage.NavigationButton(driver);
//	NavigationButton.click();
//	
//	WebElement Logout=LogoutPage.Logout(driver);
//	Logout.click();
	String Expected=datatable.getCellData("Sheet1","Expected Result",2);
	System.out.println(Result);
	
	if(Result.equals(Expected))
	{
		datatable.setCellData("Sheet1", "Actual Result", 2, "PASS");
		System.out.println("PASS");
		
	}
	else{
		datatable.setCellData("Sheet1", "Actual Result", 2, "FAIL");
	System.out.println("FAIL");
	}
	
}
}


