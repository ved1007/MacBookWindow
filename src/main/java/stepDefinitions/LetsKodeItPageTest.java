package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LetsKodeItPageTest {
	
	WebDriver driver;
	
	@Given("^Open Web Page$")
	public void open_Web_Page()   {
		
		//Window
		System.setProperty("webdriver.chrome.driver", "C:/Users/PC User1/Documents/Devops/chromedriver.exe");
		
		//Macbook
//		System.setProperty("webdriver.chrome.driver","/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	

}
