package hw_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFailure {
	
	@Test
	public void test_fail() {
		Assert.fail();;
		
	}
	
	@Test(dependsOnMethods= {"test_fail"})
	public void test_skip() {
		System.out.println("It won't enter here.");
	}

}
