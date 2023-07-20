package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Simple {
	
	WebDriver driver;
	
	public void startBrowser(String url)
	
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void login(String username, String pass)
	{
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	
	public void takeScreenshot() throws Throwable
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("Screenshot/srikant_.jpg");
		FileHandler.copy(src, des);
	}

	public static void main(String[] args) throws Throwable {
		
		Simple obj=new Simple();
		obj.startBrowser("http:orangehrm.qedgetech.com");
		obj.login("Admin","Admin123!@#");
		obj.takeScreenshot();
		

	}

}
