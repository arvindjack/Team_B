import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guru {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Arvind");
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name=\"phone\"]")).sendKeys("7982183656");
		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("kumararvindad@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"address1\"]")).sendKeys("Btm Layout");
		driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//input[@name=\"postalCode\"]")).sendKeys("560029");
		
		Select dropDown=new Select(driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("FRANCE");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("risar86641@submic.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@name=\"confirmPassword\"]")).sendKeys("Password@123");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		driver.close();
		
		
		
		
		
		

	}

}
