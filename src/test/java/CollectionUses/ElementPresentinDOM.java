package CollectionUses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresentinDOM {
      
	
	public static void main(String[] args) {
		WebDriver driver;
     driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");
     
     //Verify element is present in DOM
     
     List<WebElement> li=driver.findElements(By.linkText("Elemental Selenium"));
     if(li.size()>0) {
    	 System.out.println("Present");
     }
     else {
    	 System.out.println("Not Present");
     }
     
     driver.close();
	}

}
