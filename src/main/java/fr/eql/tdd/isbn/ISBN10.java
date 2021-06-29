package fr.eql.tdd.isbn;

public class ISBN10 extends ISBN {

	public ISBN10(String value) {
		super(value);
		LENGTH = 10;
	}

	@Override
	public void checkDigits() {
		for (int i = 0; i < LENGTH; i++) {

			if (i == 9 && this.getValue().charAt(i) == 'X') {
				// X as last digit is ok
			} else if (!Character.isDigit(this.getValue().charAt(i))) {
				throw new NumberFormatException("Wrong ISBN : must contain only digits (last digit can be 'X')");
			}
		}
	}

	@Override
	public boolean isValid() {
		int checksum = 0;

		for (int i = 0; i < LENGTH; i++) {
			if (i == LENGTH - 1 && this.getValue().charAt(i) == 'X') {
				checksum += 10;
			} else {
				checksum += this.getValue().charAt(i) * (LENGTH - i);
			}
		}

		return (checksum % 11 == 0) ? true : false;
	}
	
}
