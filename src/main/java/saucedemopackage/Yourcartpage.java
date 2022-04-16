package saucedemopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Yourcartpage {
	//@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartbutton;
	@FindBy(xpath="//button[@name='checkout']")private WebElement Checkoutbutton;
	
	public Yourcartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonChechoutButton()
	{
		//cartbutton.click();
		Checkoutbutton.click();
	}
}
