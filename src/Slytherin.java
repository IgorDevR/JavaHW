public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String fullName, int wizardry, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(fullName, wizardry, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void comparisonInsideFaculty(Slytherin student) {

        int thisSum = cunning + determination + ambition + resourcefulness + lustForPower;
        int otherSum = student.cunning + student.determination + student.ambition + student.resourcefulness + student.lustForPower;

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
                "\ncunning=" + cunning +
                "\ndetermination=" + determination +
                "\nambition=" + ambition +
                "\nresourcefulness=" + resourcefulness +
                "\nlustForPower=" + lustForPower;
    }
}
