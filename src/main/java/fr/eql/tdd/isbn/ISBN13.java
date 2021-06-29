package fr.eql.tdd.isbn;

public class ISBN13 extends ISBN {

	public ISBN13(String value) {
		super(value);
		LENGTH = 13;
	}

	@Override
	public void checkDigits() {
		for (int i = 0; i < LENGTH; i++) {
			if (!Character.isDigit(this.getValue().charAt(i))) {
				throw new NumberFormatException("Wrong ISBN : must contain only digits");
			}
		}
	}

	@Override
	public boolean isValid() {
		int checksum = 0;
		
		 for (int i = 0; i < LENGTH; i++) {
		    if( i% 2 == 0) {
			checksum += Character.getNumericValue(this.getValue().charAt(i)) ;
		    } else {
			checksum += Character.getNumericValue(this.getValue().charAt(i)) * 3;
		    }
		 }
		return (checksum % 10 == 0) ? true : false;
	}

}
