package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sashko on 6/15/17.
 */
public class MoneyTest {

	@Test
	public void test() {
		System.out.println("Fixed Tests calculateYears");
		assertEquals(3, Money.calculateYears(1000,0.05,0.18,1100));
		assertEquals(14 , Money.calculateYears(1000,0.01625,0.18,1200));
		assertEquals(0, Money.calculateYears(1000,0.05,0.18,1000));
		randomTest();
	}

	private int calculateYearsSol(double principal, double interest,  double tax, double desired) {
		double prev = principal; int i = 0;
		while (desired > prev) {
			prev = prev * (1 + interest - interest * tax);
			i++;
		}
		return i;
	}

	private int randInt(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}

	private void randomTest() {
		System.out.println("100 Random Tests");
		for (int i = 0; i < 100; i++) {
			double principal = randInt(1, 1000) * 10000.0;
			double interest = randInt(1, 8) / 100.0;
			double tax = randInt(5, 20) / 100.0;
			double desiredPrincipal = randInt(100, 10000) + principal;
			assertEquals(calculateYearsSol(principal,interest,tax,desiredPrincipal) ,
					Money.calculateYears(principal,interest,tax,desiredPrincipal));
		}
	}

}