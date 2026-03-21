package CollectionUses;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandle {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get(null);
		

	}
	@Test
	public void windosHandle(){
		String parentWindow=driver.getWindowHandle();
		driver.findElement(By.id("clicklink"));
		Set<String> se=driver.getWindowHandles();// it wont allow to use index system and wont allow duplicate
		
		
	}
	

}
