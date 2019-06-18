package alpha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

		//14/6/2019
			
		WebDriver driver;
		public RediffHomePage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(linkText="Books")
		WebElement Books;
				
		By search=By.id("srchword");
		By Submit=By.xpath("//input[@type='submit']");
		
		public WebElement Search()
		{
			return driver.findElement(search);
		}
		
		public WebElement submit()
		{
			return driver.findElement(Submit);
		}
		
		public WebElement Books()
		{
			return Books;
		}
	}


