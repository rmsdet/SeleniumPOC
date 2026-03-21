package TestNGUse;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups={"smoke"})
	public void Test1() {
		System.out.println("Test1 executed");
	}
	@Test
	public void Test2() {
		System.out.println("Test2 executed");
	}
	@Test
	public void Test3() {
		System.out.println("Test2 executed");
	}
	@Test
	public void Test4() {
		System.out.println("Test4 executed");
	}

}
