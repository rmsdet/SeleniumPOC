package TestNGUse;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=2)
	public void Test1() {
		System.out.println("Test1 method");
	}
	@Test
	public void Test2() {
		System.out.println("Test2 method");
	}
	@Test
	public void Test3() {
		System.out.println("Test3 method");
	}
}
