package JUnitDemoPackage;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings = {"madam","amma","rohan"})
	void testPalindrome(String word) {
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));
		
	}
	
}
