package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage 
{
	public static WebElement NavigationButton(WebDriver driver)
	{
		return driver.findElement(By.id("userNavigationLabel"));
	}
	public static WebElement Logout(WebDriver driver )
	{
		WebDriverWait wait1=new WebDriverWait(driver,45);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='js_3q']/div/div/ul/li[12]/a/span/span")));
	return driver.findElement(By.cssSelector("form[action='https://www.facebook.com/logout.php?button_name=logout&button_location=settings']"));
	
	}

}
