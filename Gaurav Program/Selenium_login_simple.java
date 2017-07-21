package Mypackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_login_simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] username={"gdangtk20", "gdang@tk20.com"};
		String[] password= {"test@password", "t3stf1rst"};
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver d =new FirefoxDriver();
		d.get("http://reportstesting1.tk20.com");
		
		for(int i=0; i<username.length;  i++)
			{
				d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				d.findElement(By.id("user")).clear();
				d.findElement(By.id("user")).sendKeys(username[i]);				
				System.out.println("UserName: " +username[i]);	
				d.findElement(By.id("pass")).clear();
				(new WebDriverWait(d, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
				d.findElement(By.id("pass")).sendKeys(password[i]);
				System.out.println("PassWord: " +password[i]);
				d.findElement(By.name("login2")).click();	
				(new WebDriverWait(d, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.className("icon-user")));
				d.findElement(By.className("icon-user")).click();
				(new WebDriverWait(d, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='preferences']/div[2]/p/a")));
				d.findElement(By.xpath(".//*[@id='preferences']/div[2]/p/a")).click();
				(new WebDriverWait(d, 20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("user")));
			}		
	}
}
