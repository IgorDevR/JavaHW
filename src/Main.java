
public class Main {
	public static void main(String[] args) {

		HW1();
		HW2();
		HW3();
		HW4();
		HW5();
	}
	public static void HW1() {
		byte aByte = 1;
		short aShort = 2;
		int anInt = 3;
		long aLong = 4L;

		float aFloat = 5.1f;
		double aDouble = 6.1d;

		char aChar = 'q';
		boolean aBoolean = false;
	}

	public static void HW2() {
		double firstBoxer = 78.2d;
		double secondBoxer = 82.7d;

		System.out.println(firstBoxer + secondBoxer);
		System.out.println(firstBoxer - secondBoxer);
	}

	public static void HW3() {

		int weightBanana = 80 * 5;
		double weightMilk = (100 + (100 * 0.05)) * 2;
		int weightIceCream = 100 * 2;
		int weightEgg = 70 * 4;

		System.out.println(weightBanana + weightMilk + weightIceCream + weightEgg);
		System.out.println((weightBanana + weightMilk + weightIceCream + weightEgg) / 1000);

	}
	public static void HW4() {

		int cntDays = 7;
		int day250gramm = 250;
		int day500gramm = 500;

		System.out.println("days 250 grams: " + cntDays * 1000 / day250gramm);
		System.out.println("days 500 grams: " + cntDays * 1000 / day500gramm);
		System.out.println("days average: " + cntDays * 1000 / ((day250gramm + day500gramm) / 2));


	}
	public static void HW5() {

		double employeeMashaSalary = 67_760;
		double employeeDenisSalary = 83_690;
		double employeeKristinaSalary = 76_230;


		double currentSalary  = employeeMashaSalary + (employeeMashaSalary * 0.1);
		double differenceSalary  = currentSalary - employeeMashaSalary;
		System.out.println("???? ?????? ???????? " + currentSalary +  " ??????. ??????? ????? ????? ?? " + differenceSalary + " ??????");

		currentSalary  = employeeDenisSalary + (employeeDenisSalary * 0.1);
		differenceSalary  = currentSalary - employeeDenisSalary;
		System.out.println("????? ?????? ???????? " + currentSalary +  " ??????. ??????? ????? ????? ?? " + differenceSalary + " ??????");

		currentSalary  = employeeKristinaSalary + (employeeKristinaSalary * 0.1);
		differenceSalary  = currentSalary - employeeKristinaSalary;
		System.out.println("????????  ?????? ???????? " + currentSalary +  " ??????. ??????? ????? ????? ?? " + differenceSalary + " ??????");


	}
}