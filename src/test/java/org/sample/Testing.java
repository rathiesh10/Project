package org.sample;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing {
   
	@Test
	private void tc1() {
		System.out.println("test1");

	}
	 
		@Test
		private void tc2() {
			System.out.println("test2");

		}
		 
		@Test
		private void tc3() {
			System.out.println("test3");
            Assert.assertTrue(false,"the test case failed");
		}
		
}
