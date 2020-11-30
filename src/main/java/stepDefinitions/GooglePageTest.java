package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GooglePageTest {
	
	WebDriver driver;
	
	@Given("^Open Web Page$")
	public void open_Web_Page()   {
		
		//Window
		System.setProperty("webdriver.chrome.driver", "C:/Users/PC User1/Documents/Devops/chromedriver.exe");
		
		//Macbook
//		System.setProperty("webdriver.chrome.driver","/Users/vedant.jagani/Documents/Automation/SampleAutomation/Drivers/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Then("^Populate the Search field$")
	public void populate_the_Search_field() throws Throwable {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Veant");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.TAB);
		
	 
	}

	@Then("^Click on the Search button$")
	public void click_on_the_Search_button()   {
	    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
	}

	@Then("^Close the Web Page$")
	public void close_the_Web_Page()   {
		driver.quit();
	    
	}

}
