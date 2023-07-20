package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Pom_ {
	
    WebDriver driver;
	
	@FindBy(xpath="//input[@placeholder='Email ID']")
	WebElement id; 
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pwd;
	
	@FindBy(xpath="//button[normalize-space()='Sign In']")
	WebElement login;
	
	public void startBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com");
		
	}
	
	public void login()
	{
		id.sendKeys("usd");
		pwd.sendKeys("pass");
		login.click();
		
	}
	

	public static void main(String[] args) {
		
		Pom_ obj=new Pom_();
		obj.startBrowser();
		obj.login();
		

	}

}
