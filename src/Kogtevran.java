public class Kogtevran extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;


    public Kogtevran(String fullName, int wizardry, int transgression, int mind, int wisdom, int wit, int creation) {
        super(fullName, wizardry, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void comparisonInsideFaculty(Kogtevran student) {

        int thisSum = (mind + wisdom + wit + creation);
        int otherSum = student.mind + student.wit + student.wit + student.creation;

        StringBuilder sb = new StringBuilder();
        int index = toString().indexOf("++++++++++") + 10;
        sb
                .append(getFullName())
                .append(toString().substring(index)).append("\n").append("sum of all points = ")
                .append(thisSum).append("\n----------------");
        System.out.println(sb);

        sb = new StringBuilder();
        index = student.toString().indexOf("++++++++++") + 10;
        sb
                .append(student.getFullName())
                .append(student.toString().substring(index)).append("\n").append("sum of all points = ")
                .append(otherSum).append("\n----------------");
        System.out.println(sb);

        String bestSt = thisSum > otherSum ? getFullName()
                : thisSum < otherSum ? student.getFullName() : "on the same level";
        System.out.println("best student: " + bestSt + "\n----------------\n");
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nGryffindor skills: " +
                "\nmind=" + mind +
                "\nwisdom=" + wisdom +
                "\nwit=" + wit +
                "\ncreation=" + creation;
    }

}
