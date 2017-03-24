
class Publisher {
	String name = "";
	String address = "";

	Publisher() {
		this.name = "John Johnson";
		this.address = "Peachtree Circle Atlanta GA";
	}

	Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}

	// getters and setters for this class
	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setAddress(String address) {
		this.address = address;
	}

	String getAddress() {
		return this.address;
	}
}
