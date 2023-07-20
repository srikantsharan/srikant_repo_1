package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibbling {
	
	WebDriver driver;
	
	public void openBrowser(String url)
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void handles()
	{
		
	}
	

	public static void main(String[] args) {
		

	}

}
