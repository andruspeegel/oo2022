package homework;

public class HomeMAIN {
    public static void main(String[] args){
        HomeINFO mobinfo = new HomeINFO("Wolf", 4, "Animal", 25);
        HomeMOB mob = new HomeMOB(mobinfo, 900);

        String XPInfo = mob.getXPInfo();
        System.out.println(XPInfo);
    }
}
