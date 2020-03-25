package com.maven.tddjunit;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class RemoveAinFirst2CharsTest {
	/*TODO list
	 * 1.If single A remove it, A => ""
	 * 2.If 2 A's remove them, AA => ""
	 * 3.A in first char : AB => B, ABCD => BCD
	 * 4.A in first 2 chars : AACD => CD
	 * 5.A in 2nd char : BA => B, BACD => BCD
	 * 6.A's not in the first 2 positions so, print as it is, BBAA => BBAA
	 * 7.AABAA => BAA
	 * 8.No A in the string BC => BC
	 * 9.Empty string "" => ""
	 */
	
	RemoveA removeA;

	@BeforeEach
	public void setUp() {

		RemoveA removeA = new RemoveA();

	}

	@Test
	public void test1RemoveSingleA() {

		assertEquals("", removeA.removeAinFirst2("A"));

	}

	@Test
	public void test2RemoveDoubleA() {

		assertEquals("", removeA.removeAinFirst2("AA"));

	}

	@Test
	public void test3RemoveAinFirstChar() {

		assertEquals("B", removeA.removeAinFirst2("AB"));

	}
	
	@Test
	public void test3RemoveAinFirstPos() {

		assertEquals("BCD", removeA.removeAinFirst2("ABCD"));

	}
	
	@Test
	public void test4RemoveAsinFirst2Chars() {

		assertEquals("CD", removeA.removeAinFirst2("AACD"));

	}

	@Test
	public void test5RemoveAinSecondChar() {

		assertEquals("B", removeA.removeAinFirst2("BA"));

	}

	@Test
	public void test5RemoveAinSecondPos() {

		assertEquals("BCD", removeA.removeAinFirst2("BACD"));

	}

	@Test
	public void test6NoAsinFirstAndSecondPos() {

		assertEquals("BBAA", removeA.removeAinFirst2("BBAA"));

	}
	
	@Test
	public void test7RemoveAinNChars() {

		assertEquals("BAA", removeA.removeAinFirst2("AABAA"));

	}

	@Test
	public void test8NoAinInput() {

		assertEquals("BC", removeA.removeAinFirst2("BC"));

	}

	@Test
	public void test9EmptyString() {

		assertEquals("", removeA.removeAinFirst2(""));

	}
	
}
