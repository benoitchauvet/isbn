package fr.eql.tdd.isbn;

public class ISBNFactory {
	
	public ISBN createISBN(String value)
	{
		if (value.length() == 10)
		{
			return new ISBN10(value);
		}
		
		if (value.length() == 13)
		{
			return new ISBN13(value);
		}
		
		throw new NumberFormatException("Wrong ISBN length : must be 10 or 13 digits");
		
	}

}
