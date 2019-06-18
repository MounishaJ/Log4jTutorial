package alpha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryExample2 {
	
		
		
		
		@FindBy(linkText="Home")
		WebElement Home;
		
		
		   public WebElement Home()
			{
			  return Home;
				   
			}
		  

}
