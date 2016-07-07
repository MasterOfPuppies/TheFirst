import junit.framework.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by EgorZhuravlev on 7/6/2016.
 */
@Category(SlowTests.class)
public class Class0 {


    Mathematics m = new Mathematics();
    int x;

    @Test(expected = ArithmeticException.class)
    public void divideTest() {

        x = (int) Math.random();
        m.divide(x, 0);

    }
}
