package StreamDemoPackage;

import java.util.*;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> inList = Arrays.asList(10,20,30,40,50);
		
		//retrieving the list
		Stream<Integer> stream = inList.stream();
		
		//filtered positive numbers
//		stream = stream.filter( (a) -> a > 0);
//		stream.forEach(System.out::println);
//		
		// reduce to return maximum number
		Optional <Integer> result = stream.reduce((a,b) -> a > b ? a : b);
		if(result.isPresent()) {
			System.out.println("Maximum number : " + result.get());
		}
		else {
			System.out.println("Stream is empty for given operation.");
		}
		
		// filter an even numbers
		stream = inList.stream().filter((a) -> a % 2 == 0);
//		
//		// reduce to return maximum number
		Optional<Integer> result2 = stream.reduce((a,b) -> a + b);
		if(result2.isPresent()) {
			System.out.println("Sum of all even numbers : " + result2.get());
		}
//		else {
//			System.out.println("Stream is empty for given operation.");
//		}
		
		
	}

}
