import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Arvind");
		driver.findElement(By.cssSelector("input#lastName")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("(//input[contains(@name,\"Username\")])[1]")).sendKeys("kumararvindad@gmail.com");
		driver.findElement(By.xpath("(//input[contains(@class,\"whsOnd zHQkBf\")])[4]")).sendKeys("Password@123");
		driver.findElement(By.xpath("(//input[contains(@name,\"ConfirmPasswd\")])")).sendKeys("Password@123");
		driver.findElement(By.xpath("(//input[contains(@id,\"i3\")])")).click();
		driver.findElement(By.xpath("//input[contains(@name,'Confirm')]/../../../../../../../../../../../../../../../../..//span[contains(text(),'Next')]")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		

	}

}
