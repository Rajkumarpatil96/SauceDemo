package saucedemopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Chechoutpage {
@FindBy(id="first-name")private WebElement fullname;
@FindBy(id="last-name")private WebElement lastname;
@FindBy(id="postal-code")private WebElement postalcode;
@FindBy(id="continue")private WebElement continuebutton;
@FindBy(xpath="//div[@class='summary_total_label']")private WebElement price;
@FindBy(id="react-burger-menu-btn")private WebElement logouttab;
@FindBy(xpath="//a[text()='Logout']")private WebElement logout;
public Chechoutpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


	public void EnterFullname(String name)
{
	fullname.sendKeys(name);	
}
	
	public void Enterlastname(String lastname1)
	{
		lastname.sendKeys(lastname1);
	}
	
	public void Enterpostalcode(String code)
	{
		postalcode.sendKeys(code);
	}
	public String getprice()
	{
		String Actualprice = price.getText();
		return Actualprice;
	}
	
	public void clickonbutton()
	{
		continuebutton.click();
	}
	public void clickonLogouttab() {
		logouttab.click();
	}
public void LogOutButton()
{
	logout.click();
}
}
