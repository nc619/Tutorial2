import java.awt.*;

public class Rect extends Shape {
        /**
         * The Circle class encapsulates the information describing a circle and can draw it in
         * an AWT Graphics object using AWT library methods
         * */
        private int h; // Fields
        private int w;
        public Rect(Point initPos, Color col, int height, int width)
        { // The constructor
            super( initPos, col);
            h = height; // Initialize fields
            w = width;
        }
        public void draw(Graphics g)
        { // A method that draws the object in g
            g.setColor(col);
            g.fillRect(pos.x, pos.y, w, h);
        }

    }
