package JUnitDemoPackage;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisableDemo {

	@Test
	void testOne() {
		System.out.println("Test 1...");
	}
	
	@Disabled
	@Test
	void testTwo() {
		System.out.println("Test 2...");
	}
	
	@Test
	void testThree() {
		System.out.println("Test 3...");
	}
	
}
