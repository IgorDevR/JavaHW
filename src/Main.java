public class Main {
    public static void main(String[] args) {

        Gryffindor HarryPotter = new Gryffindor("Harry Potter", 60, 50, 45, 55, 65);
        Gryffindor HermioneGranger = new Gryffindor("Hermione Granger", 70, 45, 55, 75, 80);
        Gryffindor RonWeasley = new Gryffindor("Ron Weasley", 40, 20, 30, 35, 36);

        Slytherin DracoMalfoy = new Slytherin("Draco Malfoy", 50, 55, 10, 23, 56, 98, 14);
        Slytherin GrahamMontagu = new Slytherin("Graham Montagu", 12, 22, 14, 65, 58, 21, 36);
        Slytherin GregoryGoyle = new Slytherin("Gregory Goyle", 20, 13, 99, 66, 17, 11, 12);

        Puffenduy ZachariahSmith = new Puffenduy("Zachariah Smith", 21, 33, 66, 21, 15);
        Puffenduy CedricDiggory = new Puffenduy("Cedric Diggory", 12, 37, 87, 69, 95);
        Puffenduy JustinFinch_Fletchley = new Puffenduy("Justin Finch_Fletchley", 57, 69, 34, 53, 68);

        Kogtevran ZhouChang = new Kogtevran("Zhou Chang", 32, 56, 89, 31, 32, 54);
        Kogtevran PadmaPatil = new Kogtevran("Padma Patil", 26, 49, 57, 36, 54, 99);
        Kogtevran MarcusBelby = new Kogtevran("Marcus Belby", 57, 32, 23, 35, 32, 21);

        HarryPotter.comparisonInsideFaculty(HermioneGranger);
        DracoMalfoy.comparisonInsideFaculty(GregoryGoyle);
        CedricDiggory.comparisonInsideFaculty(JustinFinch_Fletchley);
        ZhouChang.comparisonInsideFaculty(PadmaPatil);

        HarryPotter.comparisonInsideSchools(GrahamMontagu);
        ZachariahSmith.comparisonInsideSchools(MarcusBelby);
        RonWeasley.comparisonInsideSchools(HermioneGranger);
       PadmaPatil.comparisonInsideSchools(CedricDiggory);

        HarryPotter.printAllСharact();
        DracoMalfoy.printAllСharact();
        ZachariahSmith.printAllСharact();
        ZhouChang.printAllСharact();
    }


}
