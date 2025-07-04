// Ear.java
package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Ear extends BodyPart {
    private static final int WIDTH  = 20;
    private static final int HEIGHT = 20;
    public static int getEarWidth(){    
    		return WIDTH;
    }		
    public static int getEarHeight(){ 
    	return HEIGHT;
    }
    public Ear() {
        super(WIDTH, HEIGHT);
    }

    @Override
    void drawAt(int left, int bottom) {
        int top = bottom - getHeight();
        Graphics pen = Drawing.pen();
        pen.setColor(Color.BLACK);
        pen.fillOval(left, top, getWidth(), getHeight());

        // inner white circle
        int innerSize = getWidth() - 15;
        int innerLeft = left + (getWidth() - innerSize) / 2;
        int innerTop  = top  + (getHeight() - innerSize) / 2;
        pen.setColor(Color.WHITE);
        pen.fillOval(innerLeft, innerTop, innerSize, innerSize);
    }
}
