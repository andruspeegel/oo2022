import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class paramAkordTest {

    @Test
    public void CKolmkolatest(){
        paramAkord paramAkord = new paramAkord("C");
        List<Integer> Expected = new ArrayList<>(Arrays.asList(60, 64, 67));
        Assert.assertEquals(paramAkord.getAkord(), Expected);
    }

    @Test
    public void FKolmkolatest(){
        paramAkord paramAkord = new paramAkord("F");
        List<Integer> Expected = new ArrayList<>(Arrays.asList(65, 69, 72));
        Assert.assertEquals(paramAkord.getAkord(), Expected);
    }

    @Test
    public void GKolmkolatest(){
        paramAkord paramAkord = new paramAkord("G");
        List<Integer> Expected = new ArrayList<>(Arrays.asList(67, 71, 74));
        Assert.assertEquals(paramAkord.getAkord(), Expected);
    }
}
