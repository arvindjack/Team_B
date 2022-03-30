import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fruits {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Arvind\\Downloads\\Demo.html");
		Thread.sleep(2000);
		Select list=new Select(driver.findElement(By.xpath("//select[@id='m1']")));
		list.selectByIndex(5);
		Thread.sleep(2000);
		list.selectByValue("3");
		Thread.sleep(2000);
		list.selectByVisibleText("Orange");
		Thread.sleep(2000);
		list.deselectByVisibleText("Orange");
		Thread.sleep(2000);
		list.deselectByIndex(5);
		Thread.sleep(2000);
		list.deselectByValue("3");
		//list.deselectAll();
		Thread.sleep(2000);
		//WebElement list=
		System.out.println(list.isMultiple());   //True/False
		driver.close();

	}

}
