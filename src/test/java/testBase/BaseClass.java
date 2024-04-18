package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;   //log4j


public class BaseClass {

	public WebDriver driver;
	public Logger logger;
	
	
	@BeforeClass
	public void setup()
	
	{
	
		logger=LogManager.getLogger(this.getClass());//Log4j
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://niconline.co.in:8443/ubportaluatnew/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void tearDown()
	{
	
	}
	
}
