package isikukood;

public class IsikukoodMain {
    public static void main(String[] args) {
        IsikukoodEE ee = new IsikukoodEE("39402431256");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthMonth());
        System.out.println(ee.getBirthYear());

        IsikukoodLV lv = new IsikukoodLV("120388-51237");
        System.out.println(lv.isMale());
        System.out.println(lv.getBirthMonth());
        System.out.println(lv.getBirthYear());
    }
}
