import org.example.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointTest {

    private Point a;
    private Point b;
    private Point expected;

    // The test methods implemented separately without using @BeforeEach

    // To test the translater() method

    @Test
    public final void testTranslater0_0(){
        Point a  = new Point(1,2);
        Point expected = new Point(1,2);
        Point obtained = a.translater(0,0);
        assertEquals(expected, obtained, "The point should not move");
    }

    // To test the equals() method

    @Test
    public final void testEquals(){
        Point a  = new Point(1,2);
        Point b  = new Point(1,2);
        assertEquals(a, b, "The two points should be equal");
    }

    // To test the translater() method

    @Test
    public final void testTranslater1_3(){
        Point a = new Point(1,2);
        Point expected = new Point(2,5);
        Point obtained = a.translater(1,3);
        assertEquals(expected, obtained, "The point should move by (1,3)");
    }
}
