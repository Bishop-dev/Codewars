package in.hubachov.codewars.java;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sashko on 6/15/17.
 */
public class DNATest {

	@Test
	public void test01() {
		assertEquals("TTTT", DNA.makeComplement("AAAA"));
	}
	@Test
	public void test02() {
		assertEquals("TAACG", DNA.makeComplement("ATTGC"));
	}
	@Test
	public void test03() {
		assertEquals("CATA", DNA.makeComplement("GTAT"));
	}
	@Test
	public void test04() {
		assertEquals("TTCC", DNA.makeComplement("AAGG"));
	}
	@Test
	public void test05() {
		assertEquals("GCGC", DNA.makeComplement("CGCG"));
	}
	@Test
	public void test06() {
		assertEquals("TAACG", DNA.makeComplement("ATTGC"));
	}
	@Test
	public void test07() {
		assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT", DNA.makeComplement("GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
	}

}