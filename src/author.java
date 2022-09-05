import java.util.Objects;

public class author {

	private String lastName;
	private String firstName;

	@Override
	public String toString() {
		return "author{" +
				"lastName='" + lastName + '\'' +
				", firstName='" + firstName + '\'' +
				'}';
	}

	public author(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		}
		author otherAuthor = (author) other;
		return this.getLastName().equals(otherAuthor.getLastName())
				&& this.getFirstName().equals(otherAuthor.getFirstName());
	}


	@Override
	public int hashCode() {
		return Objects.hash(getFirstName() + getLastName());
	}
}
