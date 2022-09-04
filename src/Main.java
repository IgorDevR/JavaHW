import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		HW1(2000);
		HW2(0, 2015);
		int del = HW3(95);
	}

	public static void hW1(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "  � ���������� ���");
		} else {
			System.out.println(year + "  � �� ���������� ���");
		}

	}

	public static void hW2(int typeOS, int yearOfIssue) {

		int currentYear = LocalDate.now().getYear();

		if (typeOS == 0) {
			if (yearOfIssue < currentYear) {
				System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
			} else {
				System.out.println("���������� ������ ���������� ��� iOS �� ������");
			}
		} else if (typeOS == 1) {
			if (yearOfIssue < currentYear) {
				System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
			} else {
				System.out.println("���������� ������ ���������� ��� Android  �� ������");
			}
		}
	}

	public static int hW3(int deliveryDistance) {

		if (deliveryDistance <= 20) {
			System.out.println("����������� ����: " + 1);
			return 1;
		} else if (deliveryDistance <= 60) {
			System.out.println("����������� ����: " + 2);
			return 2;
		} else if (deliveryDistance <= 100) {
			System.out.println("����������� ����: " + 3);
			return 3;
		}
		return -1;
	}
}