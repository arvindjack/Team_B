import java.util.List;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon {
			
					public static void main(String[] args) {
						System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
						WebDriver driver=new ChromeDriver();
						driver.manage().window().maximize();
						driver.get("https://www.amazon.in/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dpd_sl_9bqbl508i4_e%26adgrpid%3D60612964962%26hvpone%3D%26hvptwo%3D%26hvadid%3D486380734071%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16066498931821969640%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062072%26hvtargid%3Dkwd-296458777401%26hydadcr%3D14454_2154375%26gclid%3DCj0KCQjwz7uRBhDRARIsAFqjulmLZ5OcWVU0343_z0f_juMrXW-1UYywZse_yXaRJmfW_mC94_ixKNIaAg6hEALw_wcB&ref_=topnav_lang");
						List<WebElement> objlink= driver.findElements(By.xpath("//i[@class=\"a-icon a-icon-radio\"]"));
						
						int j=0;
						for(int i=0;i<objlink.size();i++)
						{
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
