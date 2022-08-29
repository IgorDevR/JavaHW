import java.util.Locale;


public class Main {
	public static void main(String[] args) {


		HW1();
		HW2();
		HW3();
	}

	static void HW1() {

		String firstName = "Ivan";
		String middleName = "Ivanovich";
		String lastName = "Ivanov";
		String fullName  = lastName + " " + middleName + " " + firstName;

		System.out.println("��� ���������� � " + fullName );
	}
	static void HW2() {

		String firstName = "Ivan";
		String middleName = "Ivanovich";
		String lastName = "Ivanov";
		String fullName  = lastName + " " + middleName + " " + firstName;

		System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullName.toUpperCase(Locale.ROOT));

	}
	static void HW3() {

		String fullName  = "������ ���� ��������";
		System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullName.replace("�", "�"));

	}
}