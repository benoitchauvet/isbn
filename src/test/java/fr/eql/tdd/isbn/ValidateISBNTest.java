package fr.eql.tdd.isbn;

import org.junit.jupiter.api.Test;

public class ValidateISBNTest {

	
	@Test
	public void checkValidISBN()
	{
		ISBNValidator val = new ISBNValidator();
		ISBN isbn = new ISBN("1654178160");
		boolean result = validator.checkISBN(isbn);
		assertTrue(result);
	}
	
}
