import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actions_MouseEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver hover, contextClicks;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaurav\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		hover = new ChromeDriver();
		hover.navigate().to("http://the-internet.herokuapp.com/hovers");
		WebElement element1 = hover.findElement((By.xpath(".//*[@id='content']/div/div[2]/img")));
		Actions action1 = new Actions(hover);
		action1.moveToElement(element1).perform();
		
		contextClicks = new ChromeDriver();
		contextClicks.navigate().to("http://the-internet.herokuapp.com/context_menu");
		WebElement element2 = contextClicks.findElement((By.xpath(".//*[@id='hot-spot']")));
		Actions action2 = new Actions(contextClicks);
		action2.moveToElement(element2).contextClick().perform();		
	}

}
