package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sashko on 6/15/17.
 */
public class BouncingBallTest {

	@Test
	public void test1() {
		assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
	}
	@Test
	public void test2() {
		assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
	}

}