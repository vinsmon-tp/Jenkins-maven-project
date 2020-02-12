package com.jenkins.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jenkins.java.Calculator;

public class TestCalc {

	Calculator calc = new Calculator();
	@Test
	public void test() {
		assertEquals(10, calc.addTwoNumbers(5, 5));
		assertEquals(10, calc.subtractTwoNumbers(15, 5));
	}

}
