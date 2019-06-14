package Testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import alpha.PagefactoryExample;
import alpha.RediffHomePage;
import alpha.RediffLoginPage;
public class Loginapplication {

	//14/6/2019
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F://Web Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		PagefactoryExample rd=new PagefactoryExample(driver);
		rd.Email().sendKeys("mounisha");
		rd.Password().sendKeys("Mounisha2128");
		Thread.sleep(2000);
		//rd.submit().click();
//		rd.Home().click();
//		RediffHomePage rh=new RediffHomePage(driver);
//		rh.Search().sendKeys("gjghd");
//		rh.submit().click();
	}
	

}
