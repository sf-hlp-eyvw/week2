class Magazine extends BookStore {

	String title = "";
	String author = "";
	String publisher = "";

	@Override
	int calculatePrice() {
		return this.author.length() * 12;
	}

	String getTitle() {
		return this.title;
	}

	void setTitle(String lastName) {
		this.title = "To Kill a Mocking Bird";
	}

}
