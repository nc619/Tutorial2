import Shapes.Circle;
import Shapes.Rect;
import Shapes.Square;
import Shapes.Shape;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

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
    private ArrayList<Shape> ShapesList = new ArrayList<Shape>();

    // The constructor
    public Drawing()
    {
        Color c3 = new Color(0x999900);
        Point p3 = new Point(300, 300);
        Color c4 = new Color(0x99);
        Point p4 = new Point(100, 100);
        Color c5 = new Color(0x990000);

        Point p5 = new Point(200, 200);
        for(int i=0;i<11;i++)
        {
            Circle c_dummy = new Circle(p3,c3,50/(i+1));
            c3=c3.brighter();
            ShapesList.add(c_dummy);
            Rect r_dummy = new Rect(p4,c4,50/(i+1),50/(i+1));
            c4=c4.brighter();
            ShapesList.add(r_dummy);
            Square s_dummy = new Square(p5,c5,50/(i+1));
            c5=c5.brighter();
            ShapesList.add(s_dummy);
        }
        setupFrame();
        setupCanvas();
    }

    private void setupCanvas()
    {
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    private void setupFrame()
    {
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

    public void paint(Graphics g) {
        /*circle1.draw(g);
        rect1.draw(g);
        square1.draw(g);*/
        for(int j = 0; j < ShapesList.size(); j++)
        {
            ShapesList.get(j).draw(g);
        }
    }

}
//lalalala
