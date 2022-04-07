package Homework;

import java.util.Scanner;

import static Homework.NewSession.basepoints;

public class MAIN {
    public static void main(String[] args) {
        int inputamount = 0;
        System.out.println("4 küsimust: Kirjutage vastuseks soovitud vastuse täht, nt: a/b/c/d. Kui soovite varem lõpetada, kirjutage end");
        QuestionOne mangija = new QuestionOne();
        QuestionTwo mangija2 = new QuestionTwo();
        QuestionThree mangija3 = new QuestionThree();
        QuestionFour mangija4 = new QuestionFour();
        if(inputamount == 0){
            System.out.println("Mis on Eesti pealinn?");
            System.out.println("a - Tallinn, b - Pärnu, c - Tartu, d - Kurressaare");
        }

        Scanner answer = new Scanner(System.in);
        String input = answer.nextLine();

            while (!input.equals("end")) {
                if (inputamount == 0) {
                    mangija.firstQuestion(input);
                }
                if (inputamount == 1) {
                    mangija2.secondQuestion(input);
                }
                if (inputamount == 2) {
                    mangija3.thirdQuestion(input);
                }
                if (inputamount == 3) {
                    mangija4.fourthQuestion(input);
                }
                inputamount = inputamount + 1;
                if (inputamount == 4) {
                    break;
                }
                if (inputamount == 1) {
                    System.out.println("Mis on Saksamaa pealinn?");
                    System.out.println("a - Dresden, b - Berlin, c - Hamburg, d - Frankfurt");
                }
                if (inputamount == 2) {
                    System.out.println("Mis on Prantsusmaa pealinn?");
                    System.out.println("a - Bordeaux, b - Nice, c - Pariis, d - Avignon");
                }
                if (inputamount == 3) {
                    System.out.println("Mis on Inglismaa pealinn?");
                    System.out.println("a - Oxford, b - Birmingham, c - Cambridge, d - London");
                }
                input = answer.nextLine();
            }
        System.out.println(basepoints);
    }
}
