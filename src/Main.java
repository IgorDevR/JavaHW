import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {

		hW1(2000);
		hW2(0, 2015);
		int del = hW3(95);
	}

	public static void hW1(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "  — високосный год");
		} else {
			System.out.println(year + "  — не високосный год");
		}

	}

	public static void hW2(int typeOS, int yearOfIssue) {

		int currentYear = LocalDate.now().getYear();

		if (typeOS == 0) {
			if (yearOfIssue < currentYear) {
				System.out.println("Установите облегченную версию приложения для iOS по ссылке");
			} else {
				System.out.println("Установите версию приложения для iOS по ссылке");
			}
		} else if (typeOS == 1) {
			if (yearOfIssue < currentYear) {
				System.out.println("Установите облегченную версию приложения для Android по ссылке");
			} else {
				System.out.println("Установите версию приложения для Android  по ссылке");
			}
		}
	}

	public static int hW3(int deliveryDistance) {

		if (deliveryDistance <= 20) {
			System.out.println("Потребуется дней: " + 1);
			return 1;
		} else if (deliveryDistance <= 60) {
			System.out.println("Потребуется дней: " + 2);
			return 2;
		} else if (deliveryDistance <= 100) {
			System.out.println("Потребуется дней: " + 3);
			return 3;
		}
		return -1;
	}
}