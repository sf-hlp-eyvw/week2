import java.util.Date;

class ElectronicBook extends BookStore {

	String title = "";
	Date dateSent;


	ElectronicBook() {
		this.dateSent = new Date();
		this.title = "Kindle version Kill a Mocking Bird";
	}

	@Override
	int calculatePrice() {
		return 1;

	}

	String getTitle() {
		return this.title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "hello this is electronic book" + dateSent;
	}

}
