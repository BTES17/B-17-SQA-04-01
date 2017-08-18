import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Drag_Drop 
{
	WebDriver driver;
@BeforeClass
public void setUp()
	{		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
@Test
public void test()
	{
		//driver.navigate().to("http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml");
		driver.get("http://the-internet.herokuapp.com/drag_and_drop");
		//WebElement element = driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/div/div/div/nav/ul/li[1]/a"));
		//Actions action = new Actions(driver);
		//action.moveToElement(element).perform();
		WebElement From = driver.findElement(By.xpath(".//*[@id='column-a']"));
		 
		WebElement To = driver.findElement(By.xpath(".//*[@id='column-b']"));
		System.out.println("From GetText:" +From.getText());
		System.out.println("To GetText:" +To.getText());
		Point x = To.getLocation();
		System.out.println("Point: " +x);
		Actions action = new Actions(driver);
		action.dragAndDropBy(From, x.getX(), x.getY()).build().perform();
		action.release();
	}

}
