package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Action {
	
	WebDriver driver;
	
	@FindBy (xpath="//input[@type=email]")
	WebElement uname;
	
	By username=By.xpath("//input[@type='email']");
	By password=By.xpath("//input[@type='password']");
	By signIn=By.xpath("//button[text()='Sign In']");
	
	
	@Test(priority=1)
	public void startTest()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http:flights.qedgetech.com");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=2)
	public void login()
	{
		driver.findElement(username).sendKeys("srikantbihari@gmail.com");
		driver.findElement(password).sendKeys("srikant123");
		driver.findElement(signIn).click();
	}
	@Test(priority = 3)
	public void booking() throws Throwable
	{
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Actions actobj= new Actions(driver);
		actobj.sendKeys(Keys.ARROW_DOWN).perform();
		actobj.sendKeys(Keys.ARROW_DOWN).perform();
		
	}
	
	

}
