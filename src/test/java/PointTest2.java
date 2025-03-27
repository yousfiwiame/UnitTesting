import org.example.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest2 {

    // The test methods implemented using @BeforeEach

    private Point a;
    private Point b;
    private Point expected;

    @BeforeEach
    public void setUp(){
        a = new Point(1,2);
        b = new Point(1,2);
        expected = new Point(1,2);
    }

    @Test
    public final void testTranslater0_0(){
        Point obtained = a.translater(0,0);
        assertEquals(expected, obtained, "The point should not move");
    }

    @Test
    public final void testEquals(){
        assertEquals(a, b, "The two points should be equal");
    }

    @Test
    public final void testTranslater1_3(){
        expected = new Point(2,5);
        Point obtained = a.translater(1,3);
        assertEquals(expected, obtained, "The point should move by (1,3)");
    }
}
