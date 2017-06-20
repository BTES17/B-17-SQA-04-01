package Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
public static WebElement getFieldUsername(WebDriver driver )
{
	return driver.findElement(By.id("email"));
}
public static WebElement getFieldPassword(WebDriver driver )
{
	return driver.findElement(By.id("pass"));
}
public static WebElement LoginClick(WebDriver driver )
{
	return driver.findElement(By.id("loginbutton"));
}
}
