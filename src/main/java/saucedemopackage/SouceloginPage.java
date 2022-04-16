package saucedemopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SouceloginPage {
@FindBy(id="user-name")private WebElement username;
@FindBy(id="password")private WebElement password;
@FindBy(xpath="//input[@type='submit']")private WebElement LoginButton;

public SouceloginPage(WebDriver driver)
  {
	PageFactory.initElements(driver, this);

   }

public void SendUserid(String un)
{
	username.sendKeys(un);
}

public void enterPassWord(String pass)
{
	password.sendKeys(pass);
}

public void ClickOnLoginbutton()
{
	LoginButton.click();
}

}
