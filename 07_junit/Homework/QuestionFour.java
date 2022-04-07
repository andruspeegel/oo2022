package Homework;

import static Homework.NewSession.basepoints;

public class QuestionFour {
    public void fourthQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Vale vastus");
                break;
            case "b":
                System.out.println("Vale vastus");
                break;
            case "c":
                System.out.println("Vale vastus");
                break;
            case "d":
                System.out.println("Õige vastus");
                basepoints = basepoints + 1;
                break;
        }
    }
}
