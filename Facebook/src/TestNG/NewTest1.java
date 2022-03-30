package TestNG;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class NewTest1 {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com");
	}
	
	@Test(enabled=false)
	public void test1()
	{
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Arvind");
		driver.findElement(By.id("LastName")).sendKeys("Kumar");
		driver.findElement(By.id("Email")).sendKeys("keshav@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@123");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("keshav@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
		System.out.println(driver.getTitle());
		
	}
	@Test(priority=1)
	public void test()
	{
		System.out.println("Test1 Priority");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("keshav@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}
	@Test(enabled=false)
	public void test3() throws InterruptedException 
	{
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		Select drpDown=new Select(driver.findElement(By.id("products-pagesize")));
		Thread.sleep(3000);
		drpDown.selectByIndex(2);
	}
	@Test(enabled=false)
	public void test4()
	{
		driver.findElement(By.xpath("//input[@id='newsletter-email']")).sendKeys("Keshavjee");
		driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']")).click();
		boolean b1=driver.findElement(By.xpath("//div[@id='newsletter-result-block']")).isDisplayed();
		System.out.println(b1);
	}
	
	@Test(enabled=false)
	public void test5()
	{
		driver.findElement(By.linkText("Electronics")).click();
		driver.findElement(By.linkText("Cell phones")).click();
		driver.findElement(By.xpath("//a[text()='Smartphone']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-43']")).click();
		
	}
	
	
	@AfterMethod
	public void Closing() 
	{
		driver.close();
	}
}

