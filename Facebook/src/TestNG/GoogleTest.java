package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test
	public void googleTitle() 
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void gmaillink() 
	{
		boolean b=driver.findElement(By.xpath("//a[@class='gb_d']")).isDisplayed();
		System.out.println(b);
	}
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
}
