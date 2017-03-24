
class Author {
	String firstName = "";
	String lastName = "";
	String city = "";

	Author() {
		this.firstName = "Harper";
		this.lastName = "Lee";
		this.city = "Atlanta";
	}

	Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	Author(String firstName, String lastName, String city) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}

	// getters and setters for this class
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getFirstName() {
		return this.firstName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	String getLastName() {
		return this.lastName;
	}

	void setCity(String city) {
		this.city = city;
	}

	String getCity() {
		return this.city;
	}
}
