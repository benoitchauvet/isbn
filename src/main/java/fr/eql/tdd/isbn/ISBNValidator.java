package fr.eql.tdd.isbn;

public class ISBNValidator {

	public boolean checkISBN(ISBN isbn) {

		isbn.checkDigits();

		return isbn.isValid();
	}

}
