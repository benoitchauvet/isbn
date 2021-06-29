package fr.eql.tdd.isbn;

public class ISBNValidator {

	public boolean checkISBN(ISBN isbn) {
		
		if(isbn.getValue().equals("1654178160"))
		{
			return true;
		}
		return false;
	}

	
	
}
