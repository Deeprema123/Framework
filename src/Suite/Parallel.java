package Suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Parallel 
{
	public  WebDriver driver;
	@Parameter({"browser"})
    @Test
    public void runner1(String Browser)
{
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	/*if (browser.equals("Firefox"))
	{
	driver=new ChromeDriver();	
	}
	else
	{
		driver=new FirefoxDriver();
	}*/
	
}
}
