public class HW1_5 {

	static void HW1() {

		int[] arrInt = new int[]{1, 2, 3};
		double[] arrDouble = {1.57, 7.654, 9.986};
		String[] arrStr = {"q", "w", "e"};
	}

	static void HW2() {

		int[] arrInt = new int[]{1, 2, 3};
		double[] arrDouble = {1.57, 7.654, 9.986};
		String[] arrStr = {"q", "w", "e"};

		for (int i = 0; i < arrInt.length; i++) {
			if (i + 1 == arrInt.length) {
				System.out.print(arrInt[i] + " ");
			} else {
				System.out.print(arrInt[i] + ",");
			}
		}
		for (int i = 0; i < arrDouble.length; i++) {
			if (i + 1 == arrDouble.length) {
				System.out.print(arrDouble[i] + " ");
			} else {
				System.out.print(arrDouble[i] + ",");
			}
		}
		for (int i = 0; i < arrStr.length; i++) {
			if (i + 1 == arrStr.length) {
				System.out.print(arrStr[i] + " ");
			} else {
				System.out.print(arrStr[i] + ",");
			}
		}
	}

	static void HW3() {

		int[] arrInt = new int[]{1, 2, 3};
		double[] arrDouble = {1.57, 7.654, 9.986};
		String[] arrStr = {"q", "w", "e"};

		for (int i = arrInt.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arrInt[i]);
			} else {
				System.out.print(arrInt[i] + ",");
			}
		}
		System.out.println();
		for (int i = arrDouble.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arrDouble[i]);
			} else {
				System.out.print(arrDouble[i] + ",");
			}
		}
		System.out.println();
		for (int i = arrStr.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arrStr[i]);
			} else {
				System.out.print(arrStr[i] + ",");
			}
		}
	}
}
