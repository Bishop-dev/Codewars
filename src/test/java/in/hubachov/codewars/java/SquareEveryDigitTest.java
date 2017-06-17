package in.hubachov.codewars.java;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by sashko on 16.06.2017.
 */
public class SquareEveryDigitTest {

	@Test
	public void test() {
		assertEquals(811181, new SquareEveryDigit().squareDigits(9119));
		assertEquals(9414, new SquareEveryDigit().squareDigits(3212));
		assertEquals(4114, new SquareEveryDigit().squareDigits(2112));
	}

	@Test
	public void randomTest() {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int test = 0;
			test += random.nextInt(10);
			test += random.nextInt(10) * 10;
			test += random.nextInt(10) * 10 * 10;
			test += random.nextInt(10) * 10 * 10 * 10;
			assertEquals(squareDigits(test), new SquareEveryDigit().squareDigits(test));
		}
	}

	private int squareDigits(int n) {
		String strDigits = String.valueOf(n);
		String result = "";
		for (char c : strDigits.toCharArray()) {
			int digit = Character.digit(c, 10);
			result += digit * digit;
		}
		return Integer.parseInt(result);
	}

}