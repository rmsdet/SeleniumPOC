package TestNGUse;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParametrzationTest {
	@Test
	@Parameters ({"browser","env"})
	public void launchApp() {
		
	}

}
