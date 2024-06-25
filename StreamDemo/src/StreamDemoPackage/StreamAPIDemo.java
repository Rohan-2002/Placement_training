package StreamDemoPackage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<Integer> stream = Stream.of(10,20,30,40,50);

		//System.out.println(stream.count());
		stream.forEach(System.out::println);
		
		// passed array in stream
		Integer [] values = {60,70,60,90,100};
		
		stream = Arrays.stream(values);
		
		System.out.println("Square of numbers : " + Arrays.toString(values) + " below : ");
		stream.map(num -> num * num).forEach(System.out::println);
		
		// limit method
		System.out.println("First 2 element from " + Arrays.toString(values) + " : ");
		Arrays.stream(values).limit(2).forEach(System.out::println);
		
		// skip method
		System.out.println("Skip first 2 element from " + Arrays.toString(values) + " : ");
		Arrays.stream(values).skip(2).forEach(System.out::println);
		
		// distinct method
		System.out.println("Showing different values from " + Arrays.toString(values) + " : ");
		Arrays.stream(values).distinct().forEach(System.out::println);
		
		List<String> word = Arrays.asList("Hello", "Stream", "Learning");
		
		Stream<String> stream1 = word.stream();
				
		System.out.println(word);
		
		
	}

}


/*
 * Output : 10
			20
			30
			40
			50
			Square of numbers : [60, 70, 60, 90, 100] below : 
			3600
			4900
			3600
			8100
			10000
			First 2 element from [60, 70, 60, 90, 100] : 
			60
			70
			Skip first 2 element from [60, 70, 60, 90, 100] : 
			60
			90
			100
			Showing different values from [60, 70, 60, 90, 100] : 
			60
			70
			90
			100
			[Hello, Stream, Learning]
 */
