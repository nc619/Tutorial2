import java.awt.*;

public class Rect {
        /**
         * The Circle class encapsulates the information describing a circle and can draw it in
         * an AWT Graphics object using AWT library methods
         * */
        private int h; // Fields
        private int w;
        private Point pos;
        private Color col;
        public Rect(Point initPos, Color col, int height, int width)
        { // The constructor
            h = height; // Initialize fields
            w = width;
            pos=initPos;
            this.col=col;
        }
        public void draw(Graphics g)
        { // A method that draws the object in g
            g.setColor(col);
            g.fillRect(pos.x, pos.y, w, h);
        }

    }
