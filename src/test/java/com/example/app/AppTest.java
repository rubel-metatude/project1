package com.example.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {
	@Test
	public void testAppMethod() {
		App classUnderTest = new App();
		assertTrue("someAppMethod should return 'true'", classUnderTest.someAppMethod());
	}
}
