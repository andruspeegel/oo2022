public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;

    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
    }

    //to ---> toString()
    //souti jaoks, et näeks.
    public void sayHello() {
        System.out.println(nimi + " says hello");
    }

    //ei uuene automaatselt. Tuleb uuesti teha kui midagi vaja lisada.
    @Override
    public String toString() {
        return "Human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                '}';
    }
}
