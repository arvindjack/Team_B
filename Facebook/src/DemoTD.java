
import java.util.List;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
public class DemoTD {
			
					public static void main(String[] args) {
						System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("http://demowebshop.tricentis.com/");
						List<WebElement> objlink= driver.findElements(By.tagName("td"));
						
						int j=0;
						for(int i=0;i<objlink.size();i++)
						{
							System.out.println(objlink.get(i).getAttribute("text"));
							j++;
						}
						if(j==0)
						{
							System.out.println("Null");
						}
						else
						{
							System.out.println("Total Number Of Elements:"+j);
						}
						driver.close();

					}
					
}
