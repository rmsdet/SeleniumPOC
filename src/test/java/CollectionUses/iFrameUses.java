package CollectionUses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iFrameUses {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String textFrame=driver.findElement(By.id("sampleHeading")).getText();
		System.out.print(textFrame);
		
		// SwicthBack to Main content
		driver.switchTo().defaultContent();
		
	}

}
