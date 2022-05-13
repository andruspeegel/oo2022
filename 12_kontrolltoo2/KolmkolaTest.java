import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KolmkolaTest {

    @Test
    public void mazoorTest(){
        Kolmkola kolmkola = new Kolmkola(60);
        List<Integer> ExpectedResult = new ArrayList<>(Arrays.asList(60, 64, 67));
        Assert.assertEquals(kolmkola.noodid(), ExpectedResult);
    }
}
