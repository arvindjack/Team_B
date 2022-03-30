import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElectronicsAction {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				
				Actions action=new Actions(driver);
				WebElement Electronic=driver.findElement(By.xpath("//a[contains(text(),\"Electronics\")]"));
				action.moveToElement(Electronic).build().perform();
				
				WebElement CellPhone=driver.findElement(By.xpath("//a[contains(text(),\"Cell phones\")]"));
				action.moveToElement(CellPhone).click().perform();
				Thread.sleep(2000);
				//driver.close();
			}
}
