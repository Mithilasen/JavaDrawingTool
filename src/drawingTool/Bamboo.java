// Bamboo.java
package drawingTool;

import java.awt.Color;


public class Bamboo {
    private static final int WIDTH  = 10;
    private static final int HEIGHT = 80;
    
    public static int getWidth(){    
    		return WIDTH;
    }		
    public static int getHeight(){ 
    	return HEIGHT;
    }

    public Bamboo() {
    	
    }

    public void drawAt(int left, int bottom) {
        drawAt(left, bottom, HEIGHT);
    }

    public void drawAt(int left, int bottom, int height) {
        int top = bottom - height;
        Drawing.pen().setColor(Color.GREEN);
        Drawing.pen().fillRect(left, top, WIDTH, height);
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawRect(left, top, WIDTH, height);
    }
}
