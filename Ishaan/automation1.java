import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class automation1 
{
public static void main(String args[])
{
	String url="C:\\Documents and Settings\\install\\Desktop\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",url);
	WebDriver driver=new ChromeDriver();
	driver.get("https://wwww.facebook.com");
	//List<WebElement> UN=driver.findElements(By.className("inputtext"));
	
	WebElement UN=driver.findElement(By.className("inputtext"));
	UN.sendKeys("646846");
	//UN.get(0).sendKeys("abc@gmail.com");
	//UN.get(1).sendKeys("1445");
	//WebElement PW=driver.findElement(By.id("pass "));
	//PW.sendKeys("12345");
//try
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	//	WebElement a=new WebElement(driver,20);
		
	WebElement LoginButton=driver.findElement(By.id("loginbutton"));
	
	LoginButton.click();
	}
	//catch(Exception e)
	{
		//System.out.println("e");
	}
	
/*String a=driver.getCurrentUrl();
System.out.println(a);
System.out.println();
System.out.println();
System.out.println();
System.out.println();
String b=driver.getPageSource();
System.out.println(b);
String title=driver.getTitle();*/
//driver.close();
driver.quit();
}
}
