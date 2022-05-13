import java.util.ArrayList;
import java.util.List;

public class Kolmkola {
    static int pohitoon;

    public Kolmkola(int pohitoon){
        Kolmkola.pohitoon = pohitoon;
    }

    public List<Integer> noodid(){
        int suurterts = pohitoon + 4;
        int kvint = pohitoon +7;
        List<Integer> noodid = new ArrayList<>();
        noodid.add(pohitoon);
        noodid.add(suurterts);
        noodid.add(kvint);

        return noodid;
    }
}
