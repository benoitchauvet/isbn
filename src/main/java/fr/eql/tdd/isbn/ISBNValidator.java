package fr.eql.tdd.isbn;

public class ISBNValidator {

	public boolean checkISBN(ISBN isbn) {

		
		if (isbn.getValue().length() != 10)
		{
			throw new NumberFormatException("Wrong ISBN : must be 10 digits");
		}
		
		
		for (int i = 0 ; i < 10; i++) {
			
			if (i == 9 && isbn.getValue().charAt(i) == 'X') {
				// X as last digit is ok
			} 
			else if (! Character.isDigit(isbn.getValue().charAt(i)))
			{
				throw new NumberFormatException("Wrong ISBN : must contain only digits");
			}
		}
		
		int checksum = 0;
		
		for(int i=0; i < 10; i++) {
			if (i == 9 && isbn.getValue().charAt(i) == 'X') {
				checksum += 10;
			}
			else {
				checksum += isbn.getValue().charAt(i) * (10 - i);
			}
		}
		
		return (checksum % 11 == 0) ? true : false;
	}
	
}
