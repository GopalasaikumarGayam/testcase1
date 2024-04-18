package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductsPage extends BasePage
{
   WebDriver driver;
	
	public SearchProductsPage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void searchIt()
	{
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.click();
		search.sendKeys("iphone 15 pro max");
		
		driver.findElement(By.xpath("//div[contains(@class,'rush-component s-featured-result-item')]//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 15 Pro Max (256 GB) - Blue Titanium']")).click();
	}
	
	
	
}
