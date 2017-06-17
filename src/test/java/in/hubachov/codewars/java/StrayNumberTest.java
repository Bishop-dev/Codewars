package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sashko on 16.06.2017.
 */
public class StrayNumberTest {

	@Test
	public void simpleArray1() {
		assertEquals(2, getActualFor(1, 1, 2));
	}

	@Test
	public void simpleArray2() {
		assertEquals(3, getActualFor(17, 17, 3, 17, 17, 17, 17));
	}

	@Test
	public void firstItem() {
		assertEquals(8, getActualFor(8, 1, 1, 1, 1, 1, 1));
	}

	@Test
	public void lastItem() {
		assertEquals(0, getActualFor(1, 1, 1, 1, 1, 1, 0));
	}

	@Test
	public void middleItem() {
		assertEquals(7, getActualFor(0, 0, 0, 7, 0, 0, 0));
	}

	@Test
	public void fifthItem() {
		assertEquals(-6, getActualFor(-21, -21, -21, -21, -6, -21, -21));
	}
/*
	@Test
	public void randomSmallArray() {
		int strayNumber = SolutionHelper.randomInt(-10000, 10000);
		int[] array = SolutionHelper.validRandomArray(101, strayNumber);
		assertEquals(strayNumber, getActualFor(array));
	}

	@Test
	public void randomBigArray() {
		int strayNumber = SolutionHelper.randomInt(-10000, 10000);
		int[] array = SolutionHelper.validRandomArray(15273, strayNumber);
		assertEquals(strayNumber, getActualFor(array));
	}
*/
	private int getActualFor(int... numbers) {
		return StrayNumber.stray(numbers);
	}

}