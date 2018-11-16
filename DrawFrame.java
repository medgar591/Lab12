
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02 Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;

    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the
     * panel.
     * 
     * @param title
     *            String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);

        int width = 800;
        int height = 600;

        // TODO: draw a dog:

        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);

        // Ears:
        RightTriangle leftEarOuter = new RightTriangle(new Point(225, 220), 100, -200, Color.ORANGE, true);
        RightTriangle leftEarInner = new RightTriangle(new Point(230, 220), 75, -175, Color.GRAY, true);

        RightTriangle rightEarOuter = new RightTriangle(new Point(575, 220), -100, -200, Color.ORANGE, true);
        RightTriangle rightEarInner = new RightTriangle(new Point(570, 220), -75, -175, Color.GRAY, true);

        // Eyes:
        Oval leftEye = new Oval(new Point(300, 300), 50, 100, Color.WHITE, true);
        Oval leftPupil = new Oval(new Point(300, 300), 30, 60, Color.BLACK, true);

        Oval rightEye = new Oval(new Point(500, 300), 50, 100, Color.WHITE, true);
        Oval rightPupil = new Oval(new Point(500, 300), 30, 60, Color.BLACK, true);

        // Nose:
        Circle nose = new Circle(new Point(400, 350), 40, Color.BLACK, true);

        // Collar:
        Oval collar = new Oval(new Point(400, 500), 250, 50, Color.GREEN, true);
        Circle tag = new Circle(new Point(400, 520), 60, Color.DARK_GRAY, true);
        Circle tagDetail = new Circle(new Point(400, 520), 40, Color.WHITE, false);

        // Mouth and Tongue:
        PolyLine mouthLeft = new PolyLine(new Point(275, 375), new Point(400, 400), 50, Color.BLACK, true);
        PolyLine mouthRight = new PolyLine(new Point(525, 375), new Point(400, 400), 50, Color.BLACK, true);
        Oval tongue = new Oval(new Point(440, 450), 50, 75, Color.RED, true);

        // Square and circle around the dog:

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();

        // TODO: add shapes to the panel:
        drawPanel.addShape(base);

        drawPanel.addShape(leftEarOuter);
        drawPanel.addShape(leftEarInner);
        drawPanel.addShape(rightEarOuter);
        drawPanel.addShape(rightEarInner);

        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightPupil);

        drawPanel.addShape(nose);

        drawPanel.addShape(collar);
        drawPanel.addShape(tag);
        drawPanel.addShape(tagDetail);

        drawPanel.addShape(mouthRight);
        drawPanel.addShape(mouthLeft);
        drawPanel.addShape(tongue);

        // set background color
        drawPanel.setBackground(Color.YELLOW);

        // add panel to frame
        this.add(drawPanel);

        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args
     *            Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
