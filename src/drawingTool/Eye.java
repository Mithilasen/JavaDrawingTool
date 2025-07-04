// Eye.java
package drawingTool;

import java.awt.Color;

public class Eye extends CircularPart {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 10;
    public static int getEyeWidth(){    
    		return WIDTH;
    }		
    public static int getEyeHeight(){ 
    	return HEIGHT;
    }
    public Eye(){
        super(WIDTH, HEIGHT);
    }

    @Override
    void drawAt(int left, int bottom) {
        super.drawAt(left, bottom);
        Drawing.pen().setColor(Color.RED);
        int pupilX = left + getWidth() / 4;
        int pupilY = bottom - getHeight() + getHeight() / 4;
        Drawing.pen().fillOval(pupilX, pupilY, getWidth() / 2, getHeight() / 2);
    }
}
