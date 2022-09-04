

public class RunApp {
	public static void main(String[] args) {

		author author1 = new author("Author1LN", "Author1FN");
		author author2 = new author("Author2LN", "Author2FN");

		book book1 = new book("Book1", author1, 2015);
		book book2 = new book("Book2", author2, 2017);

		book1.setYearOfPublication(2020);
		book2.setYearOfPublication(2021);

	}


}

