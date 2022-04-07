package Homework;


public class QuestionTwo extends PointCounter {
    public void secondQuestion(String input) {
        switch (input) {
            case "a":
                System.out.println("Vale vastus");
                break;
            case "b":
                System.out.println("Õige vastus");
                basepoints = basepoints + TwoPoint;
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
