package saucedemopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartSouce {
@FindBy(xpath="//a[@class='shopping_cart_link']")private WebElement CartButton;
@FindBy(xpath="(//button[text()='Add to cart'])[1]")private WebElement AddtocartButton;
public AddtoCartSouce(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void addcart()
{
	AddtocartButton.click();
}

public void clickOnButton()
{
	CartButton.click();
}

}
