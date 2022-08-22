public class HW1_3 {

	public static void HW1() {

		int clientOS = 0;

		if (clientOS == 0) {
			System.out.println("”становите версию приложени€ дл€ iOS по ссылке");
		} else if (clientOS == 1) {
			System.out.println("”становите версию приложени€ дл€ Android  по ссылке");
		}
	}

	public static void HW2() {

		int clientOS = 0;
		int clientDeviceYear = 2014;

		if (clientOS == 0) {
			if (clientDeviceYear < 2015) {
				System.out.println("”становите облегченную версию приложени€ дл€ iOS по ссылке");
			} else {
				System.out.println("”становите версию приложени€ дл€ iOS по ссылке");
			}
		} else if (clientOS == 1) {
			if (clientDeviceYear < 2015) {
				System.out.println("”становите облегченную версию приложени€ дл€ Android по ссылке");
			} else {
				System.out.println("”становите версию приложени€ дл€ Android  по ссылке");
			}
		}
	}

	public static void HW3() {

		int year = 2021;

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " год €вл€етс€ високосным");
		} else {
			System.out.println(year + " год не €вл€етс€ високосным");
		}

	}

	public static void HW4() {

		int deliveryDistance = 91;

		if (deliveryDistance <= 20) {
			System.out.println("ѕотребуетс€ дней: " + 1);
		} else if (deliveryDistance <= 60) {
			System.out.println("ѕотребуетс€ дней: " + 2);
		} else if (deliveryDistance <= 100) {
			System.out.println("ѕотребуетс€ дней: " + 3);
		}
	}

	public static void HW5() {

		int monthNumber = 12;

		if (monthNumber / 3 == 1) {
			System.out.println("весна");
		} else if (monthNumber / 3 == 2) {
			System.out.println("лето");
		} else if (monthNumber / 3 == 3) {
			System.out.println("осень");
		} else {
			System.out.println("зима");
		}

	}

}
