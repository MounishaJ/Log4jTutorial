package alpha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	//14/6/2019
	WebDriver driver;
	
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}

	   By username=By.xpath(".//*[@id='login1']");
	   By password=By.name("passwd");
	   By go=By.name("proceed");
	   By home=By.linkText("Home");
	  
	  
	
	   public WebElement Emailid()
	   {
		   return driver.findElement(username);
		   
	   }
	   public WebElement Pwd()
	   {
		   return driver.findElement(password);
	   }   

		   public WebElement submit()
		   {
			   return driver.findElement(go);
			   
		   }
		   public WebElement Home()
		   {
			   return driver.findElement(home);
			   
		   }
}
