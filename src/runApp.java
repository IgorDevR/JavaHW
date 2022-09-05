public class runApp {
	public static void main(String[] args) {

		author author1 = new author("Author1LN", "Author1FN");
		author author2 = new author("Author2LN", "Author2FN");

		book book1 = new book("Book1", author1, 2015);
		book book2 = new book("Book2", author2, 2017);

		System.out.println(book1);
		System.out.println(book2);

		book1.setYearOfPublication(2020);
		book2.setYearOfPublication(2021);

		System.out.println(book1);
		System.out.println(book2);

		author author1Duplicate = new author("Author1LN", "Author1FN");

		book book3 = new book("Book3", author1, 2015);
		book book3Duplicate = new book("Book3", author1, 2015);

		System.out.println("_________________");
		System.out.println(author1.equals(author2));
		System.out.println("_________________");
		System.out.println(author1.equals(author1Duplicate));
		System.out.println(book3.equals(book3Duplicate));
		System.out.println(author1.hashCode() == author1Duplicate.hashCode());
		System.out.println(book3.hashCode() == book3Duplicate.hashCode());


	}


}
