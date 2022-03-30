import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWeb {
	
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://demowebshop.tricentis.com/");
				List<WebElement> objlink= driver.findElements(By.tagName("a"));
			/*	
				for(WebElement realobj:objlink)
				{
					String strlinktext=realobj.getText();
					System.out.println(strlinktext);
				}
			*/
				int j=0;
				for(int i=0;i<objlink.size();i++)
				{
					System.out.println(objlink.get(i).getAttribute("text"));
					j++;
				}
				System.out.println("====================");
				System.out.println("Total No Of Elements="+j);
				driver.close();

			}


	}
