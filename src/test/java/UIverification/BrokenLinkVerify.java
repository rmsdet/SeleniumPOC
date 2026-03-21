package UIverification;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import BasePackage.BaseTest;

public class BrokenLinkVerify extends BaseTest{

	@Test
	void verifyBrokenLink()
	{
		//Find all links and store it in List
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (int i=0;i<links.size();i++)
		{
			String url=links.get(i).getAttribute("href");
			if (url==null||url.isEmpty() || url.startsWith("href"))
			{
				System.out.println("Broken Link...");
				continue;
			}
			try {
				HttpURLConnection connection=(HttpURLConnection) new URL(url).openConnection();
						connection.connect();//connect to the server
						int responsecode=connection.getResponseCode();
						if (responsecode>=400)
						{
							System.out.println(url+"Broken Link"+responsecode);
						}
						else
						{
							System.out.println(url+"Valid Link-->"+responsecode);
						}
						connection.disconnect();
			}catch (Exception e) {
				
				System.out.println("Exception Handling ");
			}
		}
		
	}
	

}
