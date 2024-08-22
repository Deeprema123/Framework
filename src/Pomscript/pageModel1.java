package Pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

	public class pageModel1
	{
	//declaration
		@FindBy(id="email")
		private WebElement Uname;
		
		@FindBy(id="pass")
		 private WebElement Upass;
		
		@FindBy(name="login")
		private WebElement btn;
		
		//Initialization
		public pageModel1(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		//utilization
		public void passdata(String un,String pwd )
		{
			Uname.sendKeys(un);
			Upass.sendKeys(pwd);
			btn.click();
		}
		
		

}
