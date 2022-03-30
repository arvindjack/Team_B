package WindowHandler;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class immplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Arvind");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("keshavjee@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password@12345");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Password@12345");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();


	}

}
