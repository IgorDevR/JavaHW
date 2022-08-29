public class HW1_4 {

	static void HW1() {

		int i = 1;

		while (i != 11) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println();

		for (i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}

	}

	static void HW2() {

		int numDay = 4;
		int numDayMount = 31;

		for (int i = numDay; i <= numDayMount; i += 7) {
			System.out.println("Сегодня пятница, " + i + " -е число. Необходимо подготовить отчет.");
		}
	}

	static void HW3() {

		int oldYears = 2022 - 200;
		int futYears = 2022 + 100;
		int period = 79;

		for (int i = oldYears; i <= futYears; i++) {
			if (i % period == 0) {
				System.out.println(i);
			}
		}


	}


}




