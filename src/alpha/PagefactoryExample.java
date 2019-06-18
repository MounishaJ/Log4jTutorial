package alpha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagefactoryExample {
	
	//17/6/2019
		WebDriver driver;
		
		public PagefactoryExample(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath=".//*[@id='login1']")
		WebElement Username;
		
		@FindBy(name="passwd")
		WebElement Password;
		
		@FindBy(name="proceed")
		WebElement Go;
		
		@FindBy(linkText="Home")
		WebElement Home;
		
		
		   public WebElement Email()
		   {
			   return Username;
			   
		   }
		   public WebElement Password()
		   {
			   return Password;
		   }   

		   public WebElement submit()
			{
			   return Go;
				   
			}
		   public WebElement Home()
			{
			  return Home;
				   
			}
		  

}
