package homework;

public class HomeMAIN {
    public static void main(String[] args) {
        PLAYERlevelgain player1 = new PLAYERlevelgain();
        player1.getLVLgain(5, 1.7);
    }

    static class PLAYERlevelgain implements HomeINTERFACE {
        @Override
        public void getLVLgain(int baselevel, double increaseamount) {
            System.out.println("The new level of the player is " + (baselevel * increaseamount));
        }
    }
}
