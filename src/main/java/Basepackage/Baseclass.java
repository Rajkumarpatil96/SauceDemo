package Basepackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Saucedata;

public class Baseclass {
	protected  WebDriver driver;
public void lounchbrowser() throws IOException
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get(Saucedata.Getdatasauce("URL"));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.manage().window().maximize();
	 
	 
	
}
public void CloseBrowser()
{
	driver.close();
}
}
