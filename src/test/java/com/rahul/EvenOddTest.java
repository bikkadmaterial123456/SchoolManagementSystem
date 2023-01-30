package com.rahul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class EvenOddTest {

	@ParameterizedTest
	@CsvFileSource(resources = "/newdata.csv", numLinesToSkip = 1)
	public void evenOrOddTest(String input ,String expected)
	{
		EvenOdd evenOdd= new EvenOdd();
		
		String actual = evenOdd.evenorOddNum(Integer.parseInt(input));
		
		assertEquals(expected, actual);
		
	}

}
