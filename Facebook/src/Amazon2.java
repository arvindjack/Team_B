import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> objlink= driver.findElements(By.tagName("a"));
		int j=0;
		for(WebElement realobj:objlink)
		{
			String strlinktext=realobj.getText();
			System.out.println(strlinktext);
			j++;
		}
		System.out.println("===============================");
		System.out.println("Total Number Of Elements:"+j);
		driver.close();
	}
}