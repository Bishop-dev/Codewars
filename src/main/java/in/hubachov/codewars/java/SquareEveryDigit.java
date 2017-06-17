package in.hubachov.codewars.java;

import static java.util.stream.Collectors.joining;

/**
 * Welcome. In this kata, you are asked to square every digit of a number.

 For example, if we run 9119 through the function, 811181 will come out.

 Note: The function accepts an integer and returns an integer
 *
 * Created by sashko on 16.06.2017.
 */
public class SquareEveryDigit {
/* BEST SOLUTION
	public int squareDigits(int n) {
		String result = "";
		while (n != 0) {
			int digit = n % 10 ;
			result = digit*digit + result ;
			n /= 10 ;
		}
		return Integer.parseInt(result) ;
	}
*/
	public int squareDigits(int n) {
		final String resultStr = new String("" + n)
				.chars()
				.mapToObj(Character::getNumericValue)
				.mapToInt(Integer::intValue)
				.boxed()
				.map(i -> (i * i) + "")
				.collect(joining(""));
		return Integer.parseInt(resultStr);
	}

}
