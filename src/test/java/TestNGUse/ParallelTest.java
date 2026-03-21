package TestNGUse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	WebDriver driver;
	@Test
	public void multipleBrowser(String browser) {
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get("https://www.google.com/");
		System.out.print(driver.getTitle());
	}
		
      
}
