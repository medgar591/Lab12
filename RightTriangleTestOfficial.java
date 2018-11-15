import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Triangle
 * 
 * @author Stephen and Matt Edgar
 * @version 2018-11-15
 */
public class RightTriangleTestOfficial
{
    private static RightTriangle triangle1 = new RightTriangle(new Point(100, 100), 50, 50, Color.BLUE, false);
    private static RightTriangle triangle2 = new RightTriangle(new Point(100, 100), 25, 100, Color.BLACK, true);

    Point t1R = new Point(100, 100);
    Point t1B = new Point(150, 100);
    Point t1T = new Point(100, 150);

    Point t2R = new Point(100, 100);
    Point t2B = new Point(125, 100);
    Point t2T = new Point(100, 200);

    /**
     * Right number of points?
     */
    @Test
    public void testRTriangleConstructorPointsArrayLength()
    {
        Point[] pts = triangle1.getLocation();
        Assert.assertEquals(3, pts.length);
    }

    /**
     * Check points
     */
    @Test
    public void testRectangleConstructorCalculatedPoints()
    {
        Point[] pts1 = triangle1.getLocation();
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, t1T));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, t1B));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, t1R));

        Point[] pts2 = triangle2.getLocation();
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, t2T));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, t2B));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, t2R));
    }

    /**
     * Unfilled case
     */
    @Test
    public void testRectangleConstructorUnfilled()
    {
        Assert.assertFalse("Fill incorrect.", triangle1.isFilled());
    }

    /**
     * Filled case
     */
    @Test
    public void testRectangleConstructorFilled()
    {
        Assert.assertTrue("Fill incorrect.", triangle2.isFilled());
    }

    /**
     * Color
     */
    @Test
    public void testRectangleConstructorColor()
    {
        Color clr1 = triangle1.getColor();
        Color clr2 = triangle2.getColor();
        Assert.assertEquals("Color incorrect.", Color.BLUE, clr1);
        Assert.assertEquals("Color incorrect.", Color.BLACK, clr2);
    }
}
