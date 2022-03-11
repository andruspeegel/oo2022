import java.util.Scanner;

public class Algarvud {
    private static final int NUM_ALGARV = 1000;
    private static final int ESIMENE_ALGARV = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        System.out.println("Sisestage arv: ");

        //Kontrollin, kas jagub 2, 3, 5, 7-mega.

        if (input % 2 == 0) {
            System.out.println("Jagub kahega");
        }
        if (input % 3 == 0) {
            System.out.println("Jagub kolmega.");
        }
        if (input % 5 == 0) {
            System.out.println("Jagub viiega");
        }
        if (input % 7 == 0) {
            System.out.println("Jagub seitsmega");
        }
        if (input % 2 != 0 && input % 3 != 0 && input % 5 != 0 && input % 7 != 0) {
            System.out.println("Ei jagu kahe, kolme, viie ega seitsmega.");
        }

        //Kontrollin, kas on algarv.

        int i = 2;
        int kontroll = 0;
        while (i <= input / 2) {
            if (input % i == 0) {
                kontroll = 1;
                break;
            }
            i++;
        }
        if (kontroll == 0) {
            System.out.println("On algarv");
        } else {
            System.out.println("Ei ole algarv");
        }

        //LEIAN sõela abil, millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut(juur?).

        int[] algarvud = new int[NUM_ALGARV];
        int loendus = 0;
        int number = ESIMENE_ALGARV;

        while (loendus < NUM_ALGARV) {
            if (onAlgarv(number)) {
                algarvud[loendus] = number;
                loendus++;
            }
            number++;
        }
        double ruutjuur = Math.sqrt(algarvud[999]);
        //System.out.println(ruutjuur);
        int Kumneloendur = 0;
        for(int Loendur = algarvud.length - 1; Loendur >= 0; Loendur--){
            while (algarvud[Loendur] < ruutjuur) {
                System.out.println(algarvud[Loendur]);
                Loendur--;
                Kumneloendur++;
                if(Kumneloendur == 10){
                    break;
                }
            }
            if(Kumneloendur == 10){
                break;
            }
        }



    }


    public static boolean onAlgarv(int number){
        for (int jagatud = 2; jagatud <= (number/2); jagatud++){
            if (number % jagatud == 0){
                return false;
            }
        }

        return true;
    }
}
