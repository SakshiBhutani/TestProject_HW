package hw_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuccess {
	
	@Test
	public void Test_Pass() {
		System.out.println("This will be successful");
		Assert.assertTrue(true);
	}

}
