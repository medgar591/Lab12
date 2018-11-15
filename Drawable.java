import java.awt.Graphics;

/**
 * Interface for describing drawable objects
 * 
 * @author Matt Edgar
 * @version 15-11-2018
 *
 */
public interface Drawable
{
    /**
     * Method for drawing a drawable object
     * 
     * @param g
     *            The graphics object to draw the object
     */
    public void draw(Graphics g);
}
