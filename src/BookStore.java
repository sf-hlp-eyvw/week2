
abstract class BookStore {

	public static void main(String[] args) {
		ElectronicBook electronicBook1 = new ElectronicBook();
		electronicBook1.toString();

		String a = "hello" + "two";
		System.out.println(a.length());
	}

	abstract int calculatePrice();


}