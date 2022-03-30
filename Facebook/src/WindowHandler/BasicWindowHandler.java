package WindowHandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWindowHandler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle=driver.getWindowHandle();
		System.out.println("Parrent Window:"+parenthandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles)
		{
			System.out.println(handle);
			if(!handle.equals(parenthandle))
			{
				driver.switchTo().window(handle);
				WebElement Element=driver.findElement(By.xpath("//input[@id='firstName']"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();", Element);
				Element.sendKeys("Arvind");
				Thread.sleep(2000);
				
				
			}
			driver.switchTo().window(parenthandle);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("My Test");
			Thread.sleep(2000);
		}
		driver.quit();

	}

}
