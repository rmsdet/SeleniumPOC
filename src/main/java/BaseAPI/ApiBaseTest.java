package BaseAPI;
import io.restassured.RestAssured;
import util.ConfigReadrer;

import org.testng.annotations.BeforeClass;

public class ApiBaseTest {
	
	    @BeforeClass
	    public void setup() {
	    	RestAssured.baseURI = ConfigReadrer.getProperty("baseURI");
	    	RestAssured.basePath = ConfigReadrer.getProperty("basePath"); 
	    	
	    }
	}


