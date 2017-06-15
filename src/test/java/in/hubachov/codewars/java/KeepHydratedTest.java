package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sashko on 6/15/17.
 */
public class KeepHydratedTest {

	KeepHydrated kh = new KeepHydrated();

	@Test
	public void basicTest1() {assertEquals(1, kh.Liters(2));}
	@Test
	public void basicTest2()  {assertEquals(0, kh.Liters(0.82));}
	@Test
	public void basicTest3()  {assertEquals(6, kh.Liters(12.83));}
	@Test
	public void basicTest4()  {assertEquals(901, kh.Liters(1802.44));}
	@Test
	public void basicTest5()  {assertEquals(30, kh.Liters(60));}
	@Test
	public void randTesting()  {

		for(int i = 0; i < 5; i++)  {

			double R = Math.random() * 100 + 1; // To 100
			assertEquals(((int)(R / 2)), kh.Liters(R));

			R = Math.random() * 10 + 1; // To 10
			assertEquals(((int)(R / 2)), kh.Liters(R));

		}

	}

}