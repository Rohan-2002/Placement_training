package JUnitDemoPackage;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class LifeCycleDemo {
	
	@BeforeEach
	void beforeEachTest() {
		System.out.println("Before each test");
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("After each test");
	}
	
	@BeforeAll
	void beforeAllTest() {
		System.out.println("Before all test");
	}
	
	@AfterAll
	void afterAllTest() {
		System.out.println("After all test");
	}
	
	@Test
	void testMehod() {
		System.out.println("Test method");
	}
	
	@Test
	void testMehodTwo() {
		System.out.println("Test method two");
	}

}


/*
 * Output : Before all test
			Before each test
			Test method
			After each test
			Before each test
			Test method two
			After each test
			After all test
 */
