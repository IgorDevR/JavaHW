public class book {

	private String nameBook;
	private author author;
	private int yearOfPublication;

	public book(String nameBook, author author, int yearOfPublication) {
		this.nameBook = nameBook;
		this.author = author;
		this.yearOfPublication = yearOfPublication;
	}

	public String getNameBook() {
		return nameBook;
	}

	public author getAuthor() {
		return author;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

	public void setYearOfPublication(int yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
}
