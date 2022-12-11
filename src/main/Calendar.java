package main;

public class Calendar {

	int year;

	public Calendar(int year) {
		this.year = year;
	}

	public boolean isLeapYear() throws ArrayIndexOutOfBoundsException{
		if (year < 1900 || year > 1999) {
			throw new ArrayIndexOutOfBoundsException("Year not in 20th Century");
		} 
		return (this.year > 0 && this.year % 4 == 0) && (this.year % 100 != 0 || this.year % 400 == 0);
	}
}
