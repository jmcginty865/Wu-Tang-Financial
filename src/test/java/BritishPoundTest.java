import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jennifermcginty on 5/22/17.
 */
public class BritishPoundTest {

    @Test
    public void britishPoundToEuroTest(){
        BritishPound britishPound = new BritishPound();

        double expected = 39.90;
        double actual = britishPound.britishPoundToEuro(35);

        Assert.assertEquals("This should return 39.90", expected, actual, .01);
    }

    
}
