package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		int expected = 1+4;
		assertEquals(expected, calculator.add(1, 4));
	}

	@ParameterizedTest
	@CsvSource({ "1,2", "3,4", "5,10" })
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		int expectedResult = valueOne + valueTwo;
		int actualResult = calculator.add(valueOne, valueTwo);
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		int expected = 10-4;
		assertEquals(expected, calculator.sub(10, 4));
	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		expectecd = 10*4;
		assertEquals(expected, calculator.multiply(10, 4));
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		float  expected = (float) 10/4;
		assertEquals(expected, calculator.divide(10, 4));
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		ArrayIndexOutOfBoundsException ex =  Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> 
				calculator.divide(10, 0) );
		String expectedMessage = "ZeroDivisionError";
		String actualMessage = ex.getMessage();

		assertTrue(actualMessage.contains(expectedMessage));
	}
}
