import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderBy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='/books'])[3]")).click();
		
		WebElement sort=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select element=new Select(sort);
		Thread.sleep(2000);
		
		List<WebElement> options = element.getOptions();
		for(int i=0;i<options.size();i++)
		{

			WebElement sort1=driver.findElement(By.xpath("//select[@id='products-viewmode']"));
			Select element2=new Select(sort1);
			element2.selectByIndex(i);
		}

	}

}
