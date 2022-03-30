import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MonsterDoubleClickPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(button).click().perform();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();

	}

}
