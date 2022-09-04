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
}
