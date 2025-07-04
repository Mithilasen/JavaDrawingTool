// Tail.java
package drawingTool;
import java.awt.Color;
import java.awt.Graphics;

public class Tail extends BodyPart {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    public static int getTailWidth(){    
    		return WIDTH;
    }		
    public static int getTailHeight(){ 
    	return HEIGHT;
    }

    public Tail() {
        super(WIDTH, HEIGHT);
    }

    @Override
    void drawAt(int left, int bottom) {
    	Graphics pen = Drawing.pen();
        int top = bottom - getHeight();
        pen.setColor(Color.BLACK);
        pen.fillOval(left, top, getWidth(), getHeight());
    }
}
