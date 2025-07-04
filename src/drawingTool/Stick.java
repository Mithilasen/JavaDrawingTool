package drawingTool;

import java.awt.Color;


public class Stick {
    private static final int WIDTH  = 10;
    private static final int HEIGHT = 80;
    
    public static int getWidth(){    
      return WIDTH;
    }		
    public static int getHeight(){ 
      return HEIGHT;
    }
    public Stick() { 
    	
    }

    public void drawAt(int left, int bottom) {
        drawAt(left, bottom, HEIGHT);
    }

    public void drawAt(int left, int bottom, int height) {
        int top = bottom - height;
        Drawing.pen().setColor(Color.decode("#5C4033"));
        Drawing.pen().fillRect(left, top, WIDTH, height+HEIGHT);
        Drawing.pen().fillRect(left, top, 6 *WIDTH , HEIGHT / 8 );
        Drawing.pen().setColor(Color.BLACK);
        Drawing.pen().drawRect(left, top, WIDTH, height + HEIGHT);
        Drawing.pen().drawRect(left, top, 6 *WIDTH , HEIGHT / 8 );
        
    }
}
