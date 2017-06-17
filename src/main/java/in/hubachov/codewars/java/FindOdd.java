package in.hubachov.codewars.java;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given an array, find the int that appears an odd number of times.

 There will always be only one integer that appears an odd number of times.


 * Created by Sashko on 6/16/17.
 */
public class FindOdd {
/*
	public static int findIt(int[] arr) {
		return Arrays.stream(arr).reduce(0, (x, y) -> x ^ y);
	}
*/
	public static int findIt(int[] A) {
		final Map<Integer, Long> map = Arrays
				.stream(A)
				.mapToObj(Integer::new)
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		return map.entrySet().stream().filter(n -> n.getValue() % 2 != 0).findFirst().get().getKey();
	}

}
