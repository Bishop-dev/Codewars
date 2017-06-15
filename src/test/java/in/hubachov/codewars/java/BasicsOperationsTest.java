package in.hubachov.codewars.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Sashko on 6/15/17.
 */
public class BasicsOperationsTest {
	BasicOperations basicOps = new BasicOperations();

	@Test
	public void testBasics() {
		System.out.println("Basic Tests");
		assertThat(basicOps.basicMath("+", 4, 7), is(11));
		assertThat(basicOps.basicMath("-", 15, 18), is(-3));
		assertThat(basicOps.basicMath("*", 5, 5), is(25));
		assertThat(basicOps.basicMath("/", 49, 7), is(7));
	}

	@Test
	public void testRandomAddition() {
		for(int i=0; i<5; i++) {
			Double random1 = Math.floor(Math.random() * 1005);
			Double random2 = Math.floor(Math.random() * 1005);
			int value1 = random1.intValue();
			int value2 = random2.intValue();

			assertThat(basicOps.basicMath("+", value1, value2), is(value1 + value2));
		}
	}

	@Test
	public void testRandomSubtraction() {
		for(int i=0; i<5; i++) {
			Double random1 = Math.floor(Math.random() * 1005);
			Double random2 = Math.floor(Math.random() * 1005);
			int value1 = random1.intValue();
			int value2 = random2.intValue();

			assertThat(basicOps.basicMath("-", value1, value2), is(value1 - value2));
		}
	}

	@Test
	public void testRandomMultiplication() {
		for(int i=0; i<5; i++) {
			Double random1 = Math.floor(Math.random() * 1005);
			Double random2 = Math.floor(Math.random() * 1005);
			int value1 = random1.intValue();
			int value2 = random2.intValue();

			assertThat(basicOps.basicMath("*", value1, value2), is(value1 * value2));
		}
	}

	@Test
	public void testRandomDivision() {
		for(int i=0; i<5; i++) {
			Double random1 = Math.floor(Math.random() * 1005);
			Double random2 = Math.floor(Math.random() * 1005);
			int value1 = random1.intValue();
			int value2 = random2.intValue();

			assertThat(basicOps.basicMath("/", value1, value2), is(value1 / value2));
		}
	}

}