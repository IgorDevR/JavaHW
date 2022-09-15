public abstract class Hogwarts  {

    private String fullName;
    private int wizardry;
    private int transgression;

    public Hogwarts(String fullName, int wizardry, int transgression) {
        this.fullName = fullName;
        this.wizardry = wizardry;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public int getWizardry() {
        return wizardry;
    }

    public int getTransgression() {
        return transgression;
    }

    public void comparisonInsideSchools(Hogwarts student) {

        StringBuilder sb = new StringBuilder();
        int sumThis = getWizardry() + getTransgression();
        int sumOther = student.getWizardry() + student.getTransgression();
        int index = toString().indexOf("++++++++++");
        sb
                .append(toString().substring(0, index)).append("\n").append("sum of all points = ")
                .append(sumThis).append("\n----------------");
        System.out.println(sb);

        sb = new StringBuilder();
        index = student.toString().indexOf("++++++++++");
        sb
                .append(student.toString().substring(0, index)).append("\n").append("sum of all points = ")
                .append(sumOther).append("\n----------------");
        System.out.println(sb);

        String bestSt = sumThis > sumOther ? getFullName()
                : sumThis < sumOther ? student.getFullName() : "on the same level";
        System.out.println("best student: " + bestSt + "\n----------------\n");

    }

    public void printAllСharact() {
        System.out.println(toString() + "\n**************\n");
    }

    @Override
    public String toString() {
        return fullName +
                "\nHogwarts skills:" +
                "\nWizardry= " + wizardry +
                "\nTransgression= " + transgression +
                "\n++++++++++";
    }


}
