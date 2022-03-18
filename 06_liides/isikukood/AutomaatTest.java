package isikukood;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4(){
        IsikukoodEE ee = new IsikukoodEE("4513112313");
        assertEquals(false, ee.isMale());
    }

    @Test
    public void kontrolli_kas_on_synniaasta_1951_kui_isikukoodi_keskel_on_51(){
        IsikukoodLV lv = new IsikukoodLV("120351-51237");
        assertEquals(1951, lv.getBirthYear());
    }
}
