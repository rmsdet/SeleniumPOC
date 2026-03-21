package TestNGUse;

import org.testng.annotations.Test;

public class IncludeExclude {
	@Test(enabled=true)
	public void show() {
		System.out.println("Enable test case");
	}
	@Test(enabled=false)
	public void show2() {
		System.out.println("Diable test case");
	}
	

}
