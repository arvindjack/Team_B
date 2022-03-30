package WindowHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class QA {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver (); driver.manage ().window () .maximize ();
			driver.get ("https://www.globalsqa.com/demo-site/frames-and-windows/");

			driver.findElement (By.xpath("//li[@id='iFrame']")).click();
			Thread.sleep (2000);

			driver.switchTo ().frame (driver.findElement (By.xpath("//iframe [@name='globalSqa']"))); 
			Thread.sleep (2000);
			driver.findElement (By.xpath("//input[@id='s']")).sendKeys("computer");
			Thread.sleep (2000);
			JavascriptExecutor ja=(JavascriptExecutor)driver;
			ja.executeScript ("window.scrollBy(0,100)");

			Actions action=new Actions (driver);
			WebElement e1=driver.findElement(By.xpath("//span[@id='current_filter]"));
			action.moveToElement(e1).build().perform();

	}

}
