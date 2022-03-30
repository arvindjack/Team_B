import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ComputerAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		Actions action=new Actions(driver);
		WebElement Computer=driver.findElement(By.xpath("(//a[contains(text(),\"Computers\")])[1]"));
		action.moveToElement(Computer).build().perform();
		
		WebElement Acces=driver.findElement(By.xpath("//a[contains(text(),\"Accessories\")]"));
		action.moveToElement(Acces).click().perform();
		driver.close();
	}

}
