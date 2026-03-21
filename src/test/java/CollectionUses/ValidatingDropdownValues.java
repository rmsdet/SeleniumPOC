package CollectionUses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingDropdownValues {

	public static void main(String[] args) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
       List<WebElement> li=driver.findElements(By.xpath("//select[@id='dropdown']/option"));
       // List to store dropdown values
       List<String> actualVa=new ArrayList<>();
       // Loop to itreate 
       for(WebElement e:li) {
    	   actualVa.add(e.getText());
       }
     
       List<String> exVa=Arrays.asList("Please select an option","Option ","Option 2");
       if(exVa.equals(actualVa)) {
    	   System.out.println("Matching");
       }
       else {
    	   System.out.println("Not Matching");
       }
       
       
       
	}

}
