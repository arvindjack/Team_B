package TestNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class NewTest2 {
  WebDriver driver;
	
	@BeforeMethod
	public void setup() 
	{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
	}
	@Test
	public void getlink() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void clickOnBookslinkTest() 
	{
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	}
	
	@Test(priority=1)
	  public void registerinapp()
	{
		System.out.println("Test2 Priority");
			driver.findElement(By.xpath("//a[contains(@href,'/register')]")).click();
			driver.findElement(By.xpath("//input[contains(@id,'gender-male')]")).click();
			driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("dharshini");
			driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("R");
			driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("dharshini.dacha@gmail.com");	
			driver.findElement(By.xpath("//input[contains(@name,'Password')]")).sendKeys("Password@123");
			driver.findElement(By.xpath("//input[contains(@name,'ConfirmPassword')]")).sendKeys("Password@123");  
			driver.findElement(By.xpath("//input[contains(@id,'register-button')]")).click();
			
	  }
	@Test(enabled=false)
	public void login()
	{
			  driver.findElement(By.xpath("//a[text()='Log in']")).click();
			  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("dharshini.dacha@gmail.com");
			  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
			  driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
	 @AfterMethod
	  public void close() throws InterruptedException
	 {
		  Thread.sleep(3000);
		 driver.close();
	  }
}
