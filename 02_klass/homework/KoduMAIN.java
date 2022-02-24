package homework;

public class KoduMAIN {
    public static void main(String[] args) {
        KoduMOB one = new KoduMOB("Warthog", 7, "Wild animal", 20);
        KoduMOB two = new KoduMOB("Golem", 74, "Construct", 570);
        System.out.println(one);
        System.out.println(two);
        one.sayMOB();
        two.sayMOB();
    }
}
