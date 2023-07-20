package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class POM {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Email ID']")
	WebElement id; 
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement login;
	
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
		driver.findElement(By.xpath("id")).sendKeys("srikantbihari@gmail.com");
		driver.findElement(By.xpath("pwd")).sendKeys("srikant123");
		driver.findElement(By.xpath("login")).click();
		
	}

}
