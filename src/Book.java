
class Book extends BookStore {
	String author = "";
	String title = "";

	Book(String title, String firstName, String lastName) {
		Author author = new Author(firstName, lastName);
		this.author = author.getFirstName() + " " + author.getLastName();
	}


	@Override
	int calculatePrice() {
		return this.author.length();
	}


}
