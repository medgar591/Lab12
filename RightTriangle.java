import java.awt.Color;
import java.awt.Point;

/**
 * This class maintains information for drawing a Right Triangle and extends
 * Polygon.
 * 
 * @author Stephen and Matt Edgar
 * @version 2018-11-15
 */
public class RightTriangle extends Polygon
{

    /**
     * Triangle constructor.
     * 
     * @param pointRightAngle
     *            The vertex of the right triangle that has the right angle.
     * @param base
     *            The width of the base. Positive widths correspond to 2nd vertex
     *            being to the right of this vertex; negative widths correspond to
     *            the 2nd vertex being to the left.
     * @param height
     *            The height at the apex of the triangle. Positive heights
     *            correspond to the vertex being placed below the base; negative
     *            heights correspond to the vertex being placed above the base.
     * @param color
     *            Desired color of the triangle.
     * @param filled
     *            Whether or not the triangle should be filled.
     */
    public RightTriangle(Point pointRightAngle, int base, int height, Color color, boolean filled)
    {
        super(color, filled);
        Point basePoint = new Point(pointRightAngle.x + base, pointRightAngle.y);
        Point tipPoint = new Point(pointRightAngle.x, pointRightAngle.y + height);

        this.location = new Point[3];
        location[0] = pointRightAngle;
        location[1] = basePoint;
        location[2] = tipPoint;
    }
}
