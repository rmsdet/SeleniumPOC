package CollectionUses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterViewQuestion {
   WebDriver driver;
   
      public void verifyBooksInRange() throws InterruptedException {
    	  
    	  driver=new ChromeDriver();
    	  driver.get("https://www.crossword.in/ ");
    	  driver.manage().window().maximize();
    	  
    	  driver.findElement(By.id("search")).sendKeys("manifest");
    	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    	  wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//p[normalize-space(text())='Recommended to You']"))));
    	  
    	  // Click on View More Link
    	  driver.findElement(By.xpath("//button[normalize-space(text())='View More']")).click();
    	  
    	  
    	  
    	  WebElement sortDropdown = driver.findElement(
    		        By.xpath("(//span[@class='wizzy-common-select-selectedItem'])[2]"));
            wait.until(ExpectedConditions.visibilityOf(sortDropdown));
            Thread.sleep(5000);
    		sortDropdown.click();
    		WebElement lowToHigh = driver.findElement(
    		        By.xpath("//div[normalize-space(@class)='wizzy-common-select-option' and normalize-space(@title)='Price: Low to High']"));

    		lowToHigh.click();
    	  //driver.close();
      }
	public static void main(String[] args) throws InterruptedException {
		InterViewQuestion ob=new InterViewQuestion();
		ob.verifyBooksInRange();
		

	}

}
