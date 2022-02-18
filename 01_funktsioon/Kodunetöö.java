import java.util.Scanner;

public class Kodunetöö {
    public static void main(String[] args) {
        System.out.println(tulemuseHinnang(55));
        System.out.println(tulemuseHinnang(75));
        System.out.println(tulemuseHinnang(1));

        System.out.println(EestiPealinn("Tallinn"));
        System.out.println(EestiPealinn("Tartu"));

        Scanner reader = new Scanner(System.in);
        float muutuja = Integer.parseInt(reader.nextLine());
        System.out.println(protsent64st(muutuja));

    }
    //Arvutab 0-100 punkti vältel tulemuse mingile testile vms.
    public static String tulemuseHinnang(float punktid) {
        if (punktid >= 0 && punktid <= 50) {
            return "Ei ole positiivne hinne (F)";
        } else if (punktid >= 51 && punktid <= 60){
            return "Hinne on E.";
        } else if (punktid >= 61 && punktid <= 70){
            return "Hinne on D.";
        } else if (punktid >= 71 && punktid <= 80){
            return "Hinne on C.";
        } else if (punktid >= 81 && punktid <= 90){
            return "Hinne on B.";
        } else if (punktid >= 91 && punktid <= 100){
            return "Hinne on A.";
        } else {
            return "Tulemust ei ole võimalik leida.";
        }
    }
    //Kui kirjutada Tallinn, siis kinnitab, et ikka tead, mis linn on Eesti pealinn. Algne plaan oli
    //teha Euroopa kohta või rohkem, aga aja kokkuhoiu mõttes võtsin ainult Eesti.
    public static String EestiPealinn(String nimi){
        if (nimi.equals("Tallinn")){
            return "See on tõesti Eesti pealinna nimi.";
        } else {
            return "See ei ole Eesti pealinna nimi";
        }
    }
    //Lihtne protsendi arvutus arvust 64. Tegin sisendiga, et saaks natuke rohkem interaktsiooni.
    public static float protsent64st(float muutuja){
        return Math.round((muutuja/64)*100);
    }
}

