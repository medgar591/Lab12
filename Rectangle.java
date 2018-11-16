import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Rectangle and extends Polygon.
 * 
 * @author Stephen and Matt Edgar
 * @version 2018-11-15
 * Lab 11
 */
public class Rectangle extends Polygon
{

    /**
     * Constructor for the Rectangle class
     * 
     * @param center Center point of the rectangle
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     * @param color Desired color for the rectangle
     * @param filled Whether or not the rectangle should be filled solid
     */
    public Rectangle(Point center, int width, int height, Color color, boolean filled)
    {
        super(color, filled);
        Point upperRight = new Point (center.x + (width / 2), center.y - (height / 2));
        Point lowerRight = new Point (center.x + (width / 2), center.y + (height / 2));
        Point upperLeft = new Point (center.x - (width / 2), center.y - (height / 2));
        Point lowerLeft = new Point (center.x - (width / 2), center.y + (height / 2));
        
        this.location = new Point[4];
        this.location[0] = upperRight;
        this.location[1] = lowerRight;
        this.location[3] = upperLeft;
        this.location[2] = lowerLeft;
    }
}