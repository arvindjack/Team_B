package WindowHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		/*
		driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[1]")).click();
		//Thread.sleep(500);
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[2]")).click();
		Alert a2=driver.switchTo().alert();
		a2.dismiss();
		
		*/
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'Click me')])[3]")).click();
		Alert a3=driver.switchTo().alert();
		a3.sendKeys("Arvind"); //not working
		driver.close();

	}

}

/*

How to handle javascript alerts?

We can't inspect any js popup.So we have to use library methods provided by Selenium Web Driver i.e

driver.switchTo().alert();
alert method is used to handle all the three types of js popups
whenever alert method is called it performs two operation::
 1)transfer the control to current popup in the browser
 2) returns the alerts interface type object
 
 In selenium there is an interface called "Alert" and it has 4 Abstract methods which is implemented in concrete class called "remoteAlert"



*/
