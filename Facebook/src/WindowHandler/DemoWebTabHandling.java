//Demo Web Shop

package WindowHandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebTabHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		String parrent=driver.getWindowHandle();
		System.out.println("Parrent Handle:"+parrent);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			if(!handle.equals(parrent))
			{
				driver.switchTo().window(handle);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumararvindad@gmail.com");
				Thread.sleep(2000);
			}
			
		}
		driver.switchTo().window(parrent);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		driver.quit();
		

	}

}
