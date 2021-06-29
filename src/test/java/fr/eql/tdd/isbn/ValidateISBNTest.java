package fr.eql.tdd.isbn;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateISBNTest {

	// STEP 1
	@Test
	public void checkValidISBN10() {
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("1654178160");
		boolean result = validator.checkISBN(isbn);
		assertTrue(result);
	}

	// STEP 2
	@Test
	public void checkInvalidISBN10() {
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("1654178167");
		boolean result = validator.checkISBN(isbn);
		assertFalse(result);
	}
	
	// STEP 3
	@Test
	public void nineDigitsISBNIsNotAllowed() {
		ISBNValidator validator = new ISBNValidator();
		
		assertThrows(NumberFormatException.class, () -> {
			ISBN isbn = new ISBNFactory().createISBN("123456789");
			validator.checkISBN(isbn);
		});
	}
	
	// STEP 4
	@Test
	public void charactersInISBN10AreNotAllowed()	{
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("abcdefghij");
		
		assertThrows(NumberFormatException.class, () -> {
			validator.checkISBN(isbn);
		});
	}
	
	
	// STEP 5
	@Test
	public void lastDigitForISBN10CanBeCharX() {
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("304013344X");
		boolean result = validator.checkISBN(isbn);
		assertTrue(result);
	}
	
	// STEP 6
	@Test
	public void checkValidISBN13()
	{
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("9782374480060");
		boolean result = validator.checkISBN(isbn);
		assertTrue(result);
	}
	
	@Test
	public void checkInvalidISBN13()
	{
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("9782374480061");
		boolean result = validator.checkISBN(isbn);
		assertFalse(result);
	}
		
	@Test
	public void charactersInISBN13AreNotAllowed()	{
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBNFactory().createISBN("abcdefghijklm");
		
		assertThrows(NumberFormatException.class, () -> {
			validator.checkISBN(isbn);
		});
	}
	
	

}
