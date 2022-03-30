import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		List<WebElement> objlink= driver.findElements(By.tagName("a"));
		/*
		for(WebElement realobj:objlink)
		{
			String strlinktext=realobj.getText();
			System.out.println(strlinktext);
		}
		*/
		for(int i=0;i<objlink.size();i++)
		{
			System.out.println(objlink.get(i).getAttribute("text"));
		}
		driver.close();

	}

}
