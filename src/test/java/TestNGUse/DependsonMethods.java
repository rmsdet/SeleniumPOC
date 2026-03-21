package TestNGUse;

import org.testng.annotations.Test;

public class DependsonMethods {
	@Test
	public void login() {
		System.out.println("Login");
	}
	@Test(dependsOnMethods="login")
	public void dshboard() {
		System.out.println("Dashboard");
	}

}
