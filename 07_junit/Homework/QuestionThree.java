package Homework;

import static Homework.NewSession.basepoints;

public class QuestionThree {
    public void thirdQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Vale vastus");
                break;
            case "b":
                System.out.println("Vale vastus");
                break;
            case "c":
                System.out.println("Õige vastus");
                basepoints = basepoints + 1;
                break;
            case "d":
                System.out.println("Vale vastus");
                break;
        }
    }
}
