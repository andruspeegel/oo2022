import java.util.List;

public class paramAkord {
    String akordheli;
    List<Integer> akord;

    public paramAkord(String akordheli){
        this.akordheli = akordheli;
    }

    public List<Integer> getAkord() {
        if(akordheli.equals("C")){
            CKolmkola cKolmkola = new CKolmkola(60);
            akord = cKolmkola.noodid();
        }
        if(akordheli.equals("F")){
            FKolmkola fKolmkola = new FKolmkola(65);
            akord = fKolmkola.noodid();
        }
        if(akordheli.equals("G")){
            GKolmkola gKolmkola = new GKolmkola(67);
            akord = gKolmkola.noodid();
        }
        return akord;
    }
}
