import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for DrawPanel
 * 
 * @author Matt Edgar
 * @version 2018-11-15
 *
 */
public class DrawPanelTest
{
    private static Square s1 = new Square(new Point(100, 100), 25, Color.BLACK, true);
    DrawPanel panel;
    Graphics g;

    @Test
    public void test()
    {
        try
        {
            panel = new DrawPanel();
            panel.addShape(s1);
            // panel.paintComponent(g);
        }
        catch (Exception e)
        {
            fail("Exception thrown: " + e);
        }
    }

}
