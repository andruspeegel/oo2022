package Homework;

public class QuestionOne extends PointCounter {
    public void firstQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Õige vastus");
                basepoints = basepoints + TwoPoint;
                break;
            case "b":
                System.out.println("Vale vastus");
                break;
            case "c":
                System.out.println("Vale vastus");
                break;
            case "d":
                System.out.println("Vale vastus");
                break;
        }
    }
}
