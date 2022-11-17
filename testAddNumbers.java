package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions JUnit = new jUnitFunctions();
		int output = JUnit.addNumber(69, 69);
		assertEquals(138,output);
	}
}
