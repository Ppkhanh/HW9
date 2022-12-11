package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	GregorianCalendar GregoCal = new GregorianCalendar();

	@ParameterizedTest
	@ValueSource(ints = { 1940, 1944, 1948, 1952, 1956 })
	public void Should_return_true(int year) {
		// Implement
		boolean expected = GregoCal.isLeapYear(year);
		Calendar cal = new Calendar(year);
		boolean actual = cal.isLeapYear();
		assertEquals(expected, actual);
		assertEquals(true, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1930, 1921, 1925, 1950, 1954 })
	public void Should_return_false(int year) {
		// Implement
		boolean expected = GregoCal.isLeapYear(year);
		Calendar cal = new Calendar(year);
		boolean actual = cal.isLeapYear();
		assertEquals(expected, actual);
		assertEquals(false, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = { 1924, 2978, 1999, 1953, 1947 })
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		boolean expected = GregoCal.isLeapYear(year);
		Calendar cal = new Calendar(year);
		boolean actual = cal.isLeapYear();
		assertEquals(expected, actual);

	}

	// Create a new method for boundary testing
	@ParameterizedTest
	@ValueSource(ints = { 1824, 2978, 1753, 1647 })
	public void is_year_in_20th_century_exception_thrown(int year) {
		Calendar cal = new Calendar(year);
		ArrayIndexOutOfBoundsException ex =  Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> 
				cal.isLeapYear());
				Assertions.assertEquals("Year not in 20th Century", ex.getMessage());
	}

}
