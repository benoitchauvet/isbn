package fr.eql.tdd.isbn;

public abstract class ISBN {

	protected static int LENGTH;
	
	private String value;
	
	public ISBN(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public abstract void checkDigits();
	
	public abstract boolean isValid();
	

}
