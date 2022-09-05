import java.util.Objects;

public class book {

	private String nameBook;
	private author author;
	private int yearOfPublication;

	@Override
	public String toString() {
		return "book{" +
				"nameBook='" + nameBook + '\'' +
				", author=" + author +
				", yearOfPublication=" + yearOfPublication +
				'}';
	}

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

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		}
		book otherBook = (book) other;
		return this.getNameBook().equals(otherBook.getNameBook()) && this.getAuthor().equals(otherBook.getAuthor()) && this.getNameBook() == getNameBook();
	}


	@Override
	public int hashCode() {
		return Objects.hash(getAuthor() + getNameBook() + getYearOfPublication());
	}
}
