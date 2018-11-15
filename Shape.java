import java.awt.Color;
import java.awt.Point;

/**
 * Class used to represent shapes
 * 
 * @author Matt Edgar
 * @version 15-11-2018
 *
 */
public abstract class Shape implements Drawable
{
    /** Point representing the location of the shape */
    protected Point[] location;

    /** Color of the shape */
    Color color;

    /** Whether the shape is filled or not */
    boolean filled;

    /**
     * Public constructor for Shape objects
     * 
     * @param color
     *            The color of the shape
     * @param filled
     *            Whether the shape is filled or not
     */
    public Shape(Color color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Returns the color of the shape
     * 
     * @return The color of the shape
     */
    public Color getColor()
    {
        return this.color;
    }

    /**
     * Returns if the shape is filled
     * 
     * @return True for a filled shape, false for a hollow shape
     */
    public boolean isFilled()
    {
        return this.filled;
    }

    /**
     * Returns the location of the shape
     * 
     * @return The location of the shape
     */
    public Point[] getLocation()
    {
        return this.location;
    }
}
