//Browser Stack programe

package WindowHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("kumararvind");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("kumararvind@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Password@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='tnc_checkbox']")).click();
		driver.findElement(By.xpath("//input[@id='user_submit']")).click();
		Alert a1=driver.switchTo().alert();
		a1.accept();
		driver.close();

	}

}
