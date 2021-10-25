import Shapes.Circle;
import Shapes.Rect;
import Shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.

    Point p2= new Point(100,100);
    Color c2 = new Color(0x669911);
    Point p=new Point(200,200);
    Color c=new Color(0x992266);
    int length = 10;
    int h=20;
    int w=40;
    int rad=50;
    private Circle circle1 = new Circle(p, c, rad);
    private Rect rect1 = new Rect(p2,c2,h,w);
    private Square square1 = new Square(p2,c,length);
    private Frame f;

    // The constructor
    public Drawing() {

        setupFrame();
        setupCanvas();
    }

    private void setupCanvas() {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g)
    {
        circle1.draw(g);
        rect1.draw(g);
        square1.draw(g);
    }

}
//lalalala
