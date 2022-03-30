import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JobJava {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();//not able to handle alert
		Actions action=new Actions(driver);
		WebElement js=driver.findElement(By.xpath("(//a[@class='main-nav-link'])[1]"));
		action.moveToElement(js).perform();
		WebElement jbs=driver.findElement(By.xpath("//a[text()='Jobs by Skills']"));
		action.moveToElement(jbs).perform();
		WebElement java=driver.findElement(By.xpath("(//a[contains(text(),'Java Jobs')])[1]"));
		action.click(java).perform();

	}

}
