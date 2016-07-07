import com.sun.xml.internal.ws.encoding.fastinfoset.FastInfosetCodec;
import javafx.scene.chart.CategoryAxis;
import org.junit.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import java.io.IOException;
import org.junit.runners.MethodSorters;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



/**
 * Created by EgorZhuravlev on 7/5/2016.
 */




@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Class1 {



    private int input_x;
    private int input_y;
    private int expected;
    private static Mathematics m;
    private static void println(String string) {
        System.out.println(string);
    }


    public Class1(int input_x, int input_y, int expected) {
        this.input_x = input_x;
        this.input_y = input_y;
        this.expected = expected;
    }


    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0, 0 }, { 1, 1, 0 }, { 2, 1, 1 }
        });
    }



    @BeforeClass
    public static void testsStarted(){
        m = new Mathematics();
        println("All tests have started");
    }

    @AfterClass
    public static void testsFinished() throws IOException {
        println("All tests have finished");
        m = null;
    }

    @Before
    public void testStarted() {
        m.setResult(0);
        println("Before Test");
    }

    @After
    public void testFinished() {

        println("After Test");
    }





    @Test
    public void deduct_Test() {

        m.deduct(input_x, input_y);

        assertEquals(expected, m.getResult());
    }



//    @Test(timeout=10)
//    public void add_Test() {
//
//        m.setResult(9);
//
//        m.add(input_x, input_y);
//
//        assertEquals(expected, m.getResult( ));
//    }

//    @Test
//    public void multiply_Test() {
//
//        m.multiply(input_x, input_y);
//
//        assertEquals(expected, m.getResult( ));
//    }
//
//   @Test
//    public void divide_Test() {
//
//        m.divide(input_x, input_y);
//
//        assertEquals(expected, m.getResult( ));
//    }

}
