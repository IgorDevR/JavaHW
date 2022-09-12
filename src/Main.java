public class Main {
	public static void main(String[] args) {

		int value = 33;
		System.out.println("value = " + value);
		changeValue(value);
		System.out.println("value = " + value);


		Integer valueInt = 33;
		System.out.println("value = " + valueInt);
		changeValueInt(valueInt);
		System.out.println("value = " + valueInt);

		Integer[] valueIntArr= new Integer[]{3,4};
		System.out.println("value = " + valueIntArr[0] + " " + valueIntArr[1] );
		changeValueIntArr(valueIntArr);
		System.out.println("value = " + valueIntArr[0] + " " + valueIntArr[1] );

		Integer[] valueIntArr2= new Integer[]{3,4};
		System.out.println("value = " + valueIntArr2[0] + " " + valueIntArr2[1] );
		changeValueIntArr2(valueIntArr2);
		System.out.println("value = " + valueIntArr2[0] + " " + valueIntArr2[1] );

		Person person = new Person();
		person.name = "Lyapis";
		person.surname = "Trubetskoy";
		System.out.println(person);
		person.changePerson(person);
		System.out.println(person);

		Person person2 = new Person();
		person2.name = "Lyapis2";
		person2.surname = "Trubetskoy2";
		System.out.println(person2);
		person2.changePerson2(person2);
		System.out.println(person2);


	}
	static void changeValue(int value){

		value = 22;
	}

	static void changeValueInt(Integer valueInt){

		valueInt = 22;
	}

	static void changeValueIntArr(Integer[] valueIntArr ){

		valueIntArr = new Integer[]{1,2};

	}

	static void changeValueIntArr2(Integer[] valueIntArr){

		valueIntArr[1] = 99;

	}

}
