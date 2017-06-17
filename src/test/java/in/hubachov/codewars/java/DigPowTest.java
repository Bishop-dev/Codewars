package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sashko on 16.06.2017.
 */
public class DigPowTest {

	private DigPow target = new DigPow();

	@Test
	public void Test1() {
		assertEquals(1, target.digPow(89, 1));
	}
	@Test
	public void Test2() {
		assertEquals(-1, target.digPow(92, 1));
	}
	@Test
	public void Test3() {
		assertEquals(51, target.digPow(46288, 3));
	}
	@Test
	public void Test4() {
		assertEquals(9, target.digPow(114, 3));
	}
	@Test
	public void Test5() {
		assertEquals(-1, target.digPow(46288, 5));
	}
	@Test
	public void Test6() {
		assertEquals(1, target.digPow(135, 1));
	}
	@Test
	public void Test7() {
		assertEquals(1, target.digPow(175, 1));
	}
	@Test
	public void Test8() {
		assertEquals(1, target.digPow(518, 1));
	}
	@Test
	public void Test9() {
		assertEquals(1, target.digPow(63761, 3));
	}
	@Test
	public void Test10() {
		assertEquals(1, target.digPow(598, 1));
	}
	@Test
	public void Test11() {
		assertEquals(1, target.digPow(1306, 1));
	}
	@Test
	public void Test12() {
		assertEquals(1, target.digPow(2427, 1));
	}
	@Test
	public void Test13() {
		assertEquals(1, target.digPow(2646798, 1));
	}
	@Test
	public void Test14() {
		assertEquals(-1, target.digPow(3456789, 1));
	}
	@Test
	public void Test15() {
		assertEquals(-1, target.digPow(3456789, 5));
	}
	@Test
	public void Test16() {
		assertEquals(3, target.digPow(198, 1));
	}
	@Test
	public void Test17() {
		assertEquals(3, target.digPow(249, 1));
	}
	@Test
	public void Test18() {
		assertEquals(2, target.digPow(1377, 1));
	}
	@Test
	public void Test19() {
		assertEquals(1, target.digPow(1676, 1));
	}
	@Test
	public void Test20() {
		assertEquals(2, target.digPow(695, 2));
	}
	@Test
	public void Test21() {
		assertEquals(19, target.digPow(1878, 2));
	}
	@Test
	public void Test22() {
		assertEquals(5, target.digPow(7388, 2));
	}
	@Test
	public void Test23() {
		assertEquals(1, target.digPow(47016, 2));
	}
	@Test
	public void Test24() {
		assertEquals(1, target.digPow(542186, 2));
	}
	@Test
	public void Test25() {
		assertEquals(5, target.digPow(261, 3));
	}
	@Test
	public void Test26() {
		assertEquals(35, target.digPow(1385, 3));
	}
	@Test
	public void Test27() {
		assertEquals(66, target.digPow(2697, 3));
	}
	@Test
	public void Test28() {
		assertEquals(10, target.digPow(6376, 3));
	}
	@Test
	public void Test29() {
		assertEquals(1, target.digPow(6714, 3));
	}
	@Test
	public void Test30() {
		assertEquals(1, target.digPow(63760, 3));
	}
	@Test
	public void Test31() {
		assertEquals(4, target.digPow(132921, 3));
	}
	@Test
	public void Test32() {
		assertEquals(12933, target.digPow(10383, 6));
	}

}