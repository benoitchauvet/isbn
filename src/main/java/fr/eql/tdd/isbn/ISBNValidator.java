package fr.eql.tdd.isbn;

public class ISBNValidator {

	public boolean checkISBN(ISBN isbn) {
		
		int checksum = 0;
		
		for(int i=0; i < 10; i++) {
			checksum += isbn.getValue().charAt(i) * (10 - i);
		}
		
		return (checksum % 11 == 0) ? true : false;
	}

	
	
}
