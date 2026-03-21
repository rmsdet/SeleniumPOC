package CollectionUses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalilaztionTesting {

	public static void main(String[] args) {
		
		Map<String, String> m=new HashMap<>();
		m.put("USA", "https://www.amazon.com");
		m.put("USA", "https://www.amazon.de");
		m.put("USA", "https://www.amazon.fr");
		
		//Country - Language
		
		Map<String, String> mm=new HashMap<>();
		mm.put("USA", "EN");
		mm.put("USA", "DE");
		mm.put("USA", "FR");
		
		// Convert hashmap into List
		
		List<String> countries = new ArrayList<>(m.keySet());
		for (int i=0;i<countries.size();i++) {
			String country=countries.get(i);
			
			
		/* public static void main(String[] args) throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        // Country → URL
        Map<String,String> countryUrl = new HashMap<>();

        countryUrl.put("USA","https://www.amazon.com");
        countryUrl.put("Germany","https://www.amazon.de");
        countryUrl.put("France","https://www.amazon.fr");


        // Country → Expected Language
        Map<String,String> expectedLanguage = new HashMap<>();

        expectedLanguage.put("USA","EN");
        expectedLanguage.put("Germany","DE"); //EN
        expectedLanguage.put("France","FR"); //EN

        // Convert HashMap keys to List
        List<String> countries = new ArrayList<>(countryUrl.keySet());
        
        //[usa, germany,fr]
        // Normal for loop
        for(int i = 0; i < countries.size(); i++) {

            String country = countries.get(i);

            String url = countryUrl.get(country);

            driver.get(url);
            
            Thread.sleep(5000);  // wait for page to load

            String actualLanguage = driver.findElement(By.id("icp-nav-flyout")).getText();

            String expected = expectedLanguage.get(country);

            if(actualLanguage.contains(expected)) {

                System.out.println(country + " Language Test Passed");

            } else {

                System.out.println(country + " Language Test Failed");

            }
        }

        driver.quit();
    }
}   */	
			
			
		}

	}

}
