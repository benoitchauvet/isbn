package fr.eql.tdd.isbn;

public abstract class ISBN {

	private String value;
	
	public ISBN(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
