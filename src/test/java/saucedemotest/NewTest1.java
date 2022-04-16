package saucedemotest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.time.Duration;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Basepackage.Baseclass;
import saucedemopackage.AddtoCartSouce;
import saucedemopackage.Chechoutpage;
import saucedemopackage.SouceloginPage;
import saucedemopackage.Yourcartpage;
import utility.Saucedata;

public class NewTest1 extends Baseclass {
	SouceloginPage login;
	AddtoCartSouce add;
	Yourcartpage ycart;
	Chechoutpage check;
	@BeforeClass
	public void Browserlounch() throws IOException
	{
		lounchbrowser();
		login=new SouceloginPage(driver);
		add=new AddtoCartSouce(driver);
		ycart=new Yourcartpage(driver);
		check=new Chechoutpage(driver);
	}
	@BeforeMethod
	public void LoginSouce() throws IOException 
	{
		login.SendUserid(Saucedata.Getdatasauce("UN"));
		login.enterPassWord(Saucedata.Getdatasauce("PASS"));
		login.ClickOnLoginbutton();
		
	}
	@Test
	public void valiadtecart()
	{   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		add.addcart();
		add.clickOnButton();
		ycart.ClickonChechoutButton();
		
		check.EnterFullname("rtfgk");
		check.Enterlastname("khggf");
		check.Enterpostalcode("524121");
		check.clickonbutton();
		
		String actualprice = check.getprice();
		String expectedprice = "Total: $32.39";
	Assert.assertEquals(actualprice, expectedprice,"Price is not matching");
		
	}
	@AfterMethod
 public void logOut()
 {
	 check.clickonLogouttab();
	 check.LogOutButton();
 }
	@AfterClass
	public void Browserclose()
	{
		CloseBrowser();
	}
	
}
