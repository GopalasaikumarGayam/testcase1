package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test
	public void verify_account_registration()
	{
		
		LoginPage Lp=new LoginPage(driver);
		  
		Lp.enterUserId("9000127027");
		Lp.enterPassword("masterpass@1993");
		Lp.clickLogin();
		
	}
	
	
	
	
}








