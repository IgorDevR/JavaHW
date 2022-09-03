

public class RunApp {
	public static void main(String[] args) {

		Author author1 = new Author("Author1LN", "Author1FN");
		Author author2 = new Author("Author2LN", "Author2FN");

		Book book1 = new Book("Book1", author1, 2015);
		Book book2 = new Book("Book2", author2, 2017);

		book1.setYearOfPublication(2020);
		book2.setYearOfPublication(2021);

	}


}

