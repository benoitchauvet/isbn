package fr.eql.tdd.isbn;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidateISBNTest {

	@Test
	public void checkValidISBN() {
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBN("1654178160");
		boolean result = validator.checkISBN(isbn);
		assertTrue(result);
	}

	@Test
	public void checkInvalidISBN() {
		ISBNValidator validator = new ISBNValidator();
		ISBN isbn = new ISBN("1654178167");
		boolean result = validator.checkISBN(isbn);
		assertFalse(result);
	}

}
