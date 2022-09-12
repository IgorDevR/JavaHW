public class Person {

    String  name;
    String surname;


    void  changePerson(Person person){

        person = new Person();
        person.name =  "Ilya";
        person.surname = "Lagutenko";

    }
    void  changePerson2(Person person){

        name =  "Ilya";
        surname = "Lagutenko";

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
