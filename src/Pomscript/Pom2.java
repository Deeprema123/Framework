package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2
{
@FindBy(xpath = "//input[@type='text']")
private WebElement se;

public Pom2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void passdata(String val )
{
	se.sendKeys(val);
	 
}
}
