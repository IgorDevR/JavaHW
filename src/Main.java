public class Main {
	public static void main(String[] args) {

		HW1();
		HW2();
		HW3();
		HW4();
	}

	static void HW1() {

		int[] costsArr = generateRandomArray();
		int sum = 0;
		for (int i = 0; i < costsArr.length; i++) {
			sum += costsArr[i];
		}
		System.out.println("—умма трат за мес€ц составила " + sum + " рублей");
	}

	static void HW2() {

		int[] costsArr = generateRandomArray();
		int min = costsArr[0];
		int max = costsArr[0];
		for (int i = 0; i < costsArr.length; i++) {

			if (costsArr[i] < min) {
				min = costsArr[i];
			}
			if (costsArr[i] > max) {
				max = costsArr[i];
			}
		}
		System.out.println("ћинимальна€ сумма трат за день составила " + min + " рублей");
		System.out.println("ћаксимальна€ сумма трат за день составила " + max + " рублей");
	}
	static void HW3() {

		int[] costsArr = generateRandomArray();
		double average = costsArr[0];

		for (int i = 0; i < costsArr.length; i++) {
			average += costsArr[i];
		}
		average /= costsArr.length;

		System.out.println("—редн€€ сумма трат за мес€ц составила " + average);
	}
	static void HW4() {

		char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

		for (int i = reverseFullName.length - 1; i >= 0 ; i--) {
			System.out.print(reverseFullName[i]);
		}
	}
	int[] arr = generateRandomArray();

	public static int[] generateRandomArray() {
		java.util.Random random = new java.util.Random();
		int[] arr = new int[30];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100_000) + 100_000;
		}
		return arr;
	}

}