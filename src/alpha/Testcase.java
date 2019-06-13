package alpha;

import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testcase {
	
	private static Logger log =LogManager.getLogger(act.class.getName());
	WebDriver driver;
	public static void main(String []args) throws InterruptedException
	{
		
		Testcase d=new Testcase();
		d.launchDriver();
		d.selectFromplace();
		d.selectToplace();
		d.selectdate();
		d.Quitbowser();
		
		
		
	}
	
	public void launchDriver()
	{
		   log.info("Setting chrome driver property");
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		   log.info("Window Maximized");
		   log.info("Now hitting Goibibo server");
		driver.get("https://www.goibibo.com/");
		 log.info("Landed on Goibibo home page");
	}
	
	
	public void selectFromplace() throws InterruptedException
	{

		//select from place
		WebElement from=driver.findElement(By.id("gosuggest_inputSrc"));
		from.sendKeys("che");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		log.info("Successfully Selected From place");
	}
		
	
	public void selectToplace() throws InterruptedException
	{

		//select to place
		WebElement to=driver.findElement(By.id("gosuggest_inputDest"));
		to.sendKeys("mum");
		Thread.sleep(2000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		log.info("Successfully Selected To place");
	}
	
	public void selectdate()
	{
String a="hello";

		//select month 

		//driver.findElement(By.xpath("(//input[@class='inputSrch curPointFlt '])[1]")).click();
		while(!driver.findElement(By.cssSelector("[class='DayPicker-Month'] [class='DayPicker-Caption']")).getText().contains("December"))
		{
			driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		}
		log.info("Successfully Selected Month"+a);
		//select date
		//driver.findElement(By.id("fare_20191205")).click();
			
		//hit search icon
		//driver.findElement(By.id("gi_search_btn")).click();

		int count=driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).size();
		//System.out.println(count);

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).getText();

		System.out.println(text);
		if(text.startsWith("2"))
		{
			driver.findElements(By.xpath("//div[@class='DayPicker-Day']")).get(i).click();
			break;
		}
		}
		log.info("Successfully Selected Day place");

}

  public void Quitbowser()

  {
	  driver.quit();
	  log.info("Successfully Quit the browser");
  }




}