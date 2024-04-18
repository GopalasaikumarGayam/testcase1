package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
 {
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
   @FindBy(xpath="//input[@id='userId']") 
   WebElement userId;
   
   @FindBy(xpath="//input[@id='password']") 
   WebElement password;
   
   @FindBy(xpath="//input[@name='next']") 
   WebElement login;
   

   public void enterUserId(String UID)
   {
	   userId.sendKeys(UID);
	 
   }
   public void enterPassword(String PWD)
   {
	   password.sendKeys(PWD);
	 
   }
   public void clickLogin()
   {
	   login.click();
	 
   }
 }
