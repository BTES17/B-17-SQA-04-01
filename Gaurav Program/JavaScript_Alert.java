import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class JavaScript_Alert {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		/*driver.navigate().to("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[25]/a")).click();
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/button")).click();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("AlertText is: " +alertText);
		alert.accept();		
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[3]/button")).click();
		alert.dismiss();
		driver.close();*/
		driver.navigate().to("file:///C:/Users/Gaurav/Desktop/myframes.html");
		new WebDriverWait(driver, 50).until(ExpectedConditions.visibilityOfElementLocated(By.id("t3p")));
		driver.switchTo().frame("t3p");
		driver.findElement(By.xpath("html/body/div[3]/div[1]/div/div/div/form/input[2]")).sendKeys("java");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("selenium_news");
		driver.findElement(By.xpath(".//*[@id='promo']/b[2]/a")).click();
	}
}
