public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String fullName, int wizardry, int transgression, int nobility, int honour, int bravery) {
        super(fullName, wizardry, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public void comparisonInsideFaculty(Gryffindor student) {

        int thisSum = nobility + honour + bravery;
        int otherSum = student.nobility + student.honour + student.bravery;

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
                        "\nnobility=" + nobility +
                        "\nhonour=" + honour +
                        "\nbravery=" + bravery;
    }

}
