package GenericScript;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Data1
{
	public	WebDriver driver ;
	@BeforeMethod
	public void openappln()
	{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
	}
	@AfterMethod
	public void closeapp() throws IOException
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots 1\\file.jpg");
	    FileHandler.copy(src, dst);
		driver.close();
	}
}
