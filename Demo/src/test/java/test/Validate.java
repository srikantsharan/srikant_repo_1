package test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validate {
	WebDriver driver;
	
	
	
    @Test(priority =   4)
	public void screenshot() throws Throwable
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("E:/srikant Eclipse/Eclipse_2023_/Demo/Screenshot/abc.jpg");
		FileHandler.copy(src, des);
	}  
	
	
	@Test(priority  = 1)
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com");
		
	}
	
	@Test(priority = 2)
	public void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("srikantbihari@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("srikant123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	}
	@Test(priority =   3)
	public void booking()
	{
		driver.findElement(By.xpath("//input[@id='search-date']")).sendKeys("25/05/2025");
		Select slobj=new Select(driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-8']//div[2]//select[1]")));
		slobj.selectByVisibleText("Hyderabad");
		Select sl=new Select(driver.findElement(By.xpath("//select[contains(@class,'sf3')]")));
		sl.selectByVisibleText("Chennai");
		driver.findElement(By.xpath("//button[normalize-space()='Search Flights']")).click();
	}
	
	@Test(priority = 5)
	public void alert() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[normalize-space()='Search Flights']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/button")).click();
	}

}
