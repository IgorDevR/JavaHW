public class Puffenduy extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffenduy(String fullName, int wizardry, int transgression, int industriousness, int loyalty, int honesty) {
        super(fullName, wizardry, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void comparisonInsideFaculty(Puffenduy student) {

        int thisSum = industriousness + loyalty + honesty;
        int otherSum = student.industriousness + student.loyalty + student.honesty;

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
                "\nindustriousness=" + industriousness +
                "\nloyalty=" + loyalty +
                "\nhonesty=" + honesty;
    }
}
