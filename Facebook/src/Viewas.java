import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Viewas {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[3]")).click();
		Select drpDown=new Select(driver.findElement(By.id("products-viewmode")));
		Thread.sleep(3000);
		drpDown.selectByValue("http://demowebshop.tricentis.com/books?orderby=10&pagesize=4&viewmode=list");
		driver.close();


	}

}
