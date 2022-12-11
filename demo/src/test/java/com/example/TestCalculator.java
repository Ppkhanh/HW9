package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.Calculator;

public class TestCalculator {
    Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		assertEquals(5, calculator.add(1, 4));
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		assertEquals(6, calculator.sub(10, 4));
	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		assertEquals(40, calculator.multiply(10, 4));
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		float expectedResult = (float)10/4;
		float realResult = calculator.divide(10, 4);
		Assertions.assertEquals( expectedResult, realResult);

		
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		Exception ex = Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {calculator.divide(10, 0);});
		Assertions.assertEquals("ZeroDivisionError", ex.getMessage());

	}
}
