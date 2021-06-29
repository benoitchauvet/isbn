package fr.eql.tdd.isbn;

public class ISBNValidator {

	public boolean checkISBN(ISBN isbn) {
		
		
		
		if (isbn.getValue().length() != 10)
		{
			throw new NumberFormatException("Wrong ISBN : must be 10 digits");
		}
		
		int checksum = 0;
		
		for(int i=0; i < 10; i++) {
			checksum += isbn.getValue().charAt(i) * (10 - i);
		}
		
		return (checksum % 11 == 0) ? true : false;
	}
	
}
