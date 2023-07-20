package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WithoutFactory {
	
	WebDriver driver;
	
	By username=By.xpath("//input[@placeholder='Email ID']");
	By password=By.xpath("//input[@placeholder='Password']");
	By login=By.xpath("//button[normalize-space()='Sign In']");
	
	@Test (priority =1)
	public void startBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com");
		
	}
	
	@Test (priority =2)
	public void login()
	{
		driver.findElement(username).sendKeys("srikantbihari@gmail.com");
		driver.findElement(password).sendKeys("srikant123");
		driver.findElement(login).click();
		
	}

	

}
