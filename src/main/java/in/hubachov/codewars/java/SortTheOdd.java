package in.hubachov.codewars.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * You have an array of numbers.
 Your task is to sort ascending odd numbers but even numbers must be on their places.

 Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

 Example

 sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]

 * Created by sashko on 16.06.2017.
 */
public class SortTheOdd {
/* BEST SOLUTION
	public static int[] sortArray(int[] array) {
		PrimitiveIterator.OfInt sortedOdds = IntStream
				.of(array)
				.filter(i -> i % 2 == 1)
				.sorted()
				.iterator();

		return IntStream
				.of(array)
				.map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
				.toArray();
	}
*/
	public static int[] sortArray(int[] array) {
		final List<Integer> odds = Arrays.stream(array).filter(n -> n % 2 != 0).boxed().collect(Collectors.toList());
		Collections.sort(odds); // use .sorted() instead of this line
		final Iterator<Integer> iterator = odds.iterator();
		return Arrays.stream(array).map(n -> {
			if (n % 2 != 0) {
				return iterator.next();
			}
			return n;
		}).toArray();
	}

}
