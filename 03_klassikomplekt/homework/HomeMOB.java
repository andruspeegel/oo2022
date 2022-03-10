package homework;

public class HomeMOB {
    HomeINFO mobinfo;
    int XPgain;

    public HomeMOB(HomeINFO mobinfo, int XPgain){
        this.mobinfo = mobinfo;
        this.XPgain = XPgain;
    }

    public String getXPInfo(){
        return "Mängu mob staatusega: " + this.mobinfo + " annab " + this.XPgain + " punkti XP'd";
    }
}
