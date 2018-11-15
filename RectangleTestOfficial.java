import java.awt.Color;
import java.awt.Point;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the Rectangle
 * 
 * @author Stephen and Matt Edgar
 * @version 2018-11-15 Lab 11
 */
public class RectangleTestOfficial
{
    private static Rectangle r1 = new Rectangle(new Point(100, 100), 100, 50, Color.BLACK, true);
    private static Point r1UL = new Point(50, 75);
    private static Point r1LL = new Point(50, 125);
    private static Point r1UR = new Point(150, 75);
    private static Point r1LR = new Point(150, 125);
    private static Rectangle r2 = new Rectangle(new Point(150, 150), 25, 25, Color.CYAN, false);
    private static Point r2UL = new Point(138, 138);
    private static Point r2LL = new Point(162, 138);
    private static Point r2UR = new Point(138, 162);
    private static Point r2LR = new Point(162, 162);

    /**
     * Right number of points?
     */
    @Test
    public void testRectangleConstructorPointsArrayLength()
    {
        Point[] pts = r1.getLocation();
        Assert.assertEquals(4, pts.length);
    }

    /**
     * Check points
     */
    @Test
    public void testRectangleConstructorCalculatedPoints()
    {
        Point[] pts1 = r1.getLocation();
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, r1UL));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, r1LL));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, r1LR));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts1, r1UR));

        Point[] pts2 = r2.getLocation();
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, r2UL));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, r2LL));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, r2LR));
        Assert.assertTrue("Point in wrong location", ShapeUtils.pointInSet(pts2, r2UR));

    }

    /**
     * Unfilled case
     */
    @Test
    public void testRectangleConstructorUnfilled()
    {
        Assert.assertFalse("Fill incorrect.", r2.isFilled());
    }

    /**
     * Filled case
     */
    @Test
    public void testRectangleConstructorFilled()
    {
        Assert.assertTrue("Fill incorrect.", r1.isFilled());
    }

    /**
     * Color
     */
    @Test
    public void testRectangleConstructorColor()
    {
        Color clr1 = r1.getColor();
        Color clr2 = r2.getColor();
        Assert.assertEquals("Color incorrect.", Color.BLACK, clr1);
        Assert.assertEquals("Color incorrect.", Color.CYAN, clr2);
    }
}
