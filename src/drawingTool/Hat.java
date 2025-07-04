// File: drawingTool/Hat.java
package drawingTool;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 * A rectangular hat accessory with a little triangular “peak” on top.
 * The brim is BIGWIDTH×HEIGHT, and the peak is an isosceles triangle of base SMALLWIDTH
 * centered on the brim, rising HEIGHT px above it.
 */
public class Hat extends BodyPart {
    private static final int SMALLWIDTH = 30; // width of the triangular peak’s base
    private static final int BIGWIDTH   = 60; // width of the rectangular brim
    private static final int HEIGHT     = 15; // height of both the brim and the peak

    public static int getsmallWidth(){    
    		return SMALLWIDTH;
    }		
    public static int getBigwidth() { 
    	return BIGWIDTH;
    }	
    public static int getHatHeight(){ 
    	return HEIGHT;
    } 
    public Hat(){
        super(SMALLWIDTH, HEIGHT);
    }


    @Override
    public void drawAt(int hatLeft, int hatBottom){
        Graphics pen = Drawing.pen();
        pen.setColor(Color.BLUE);

        // 1) Draw the rectangular brim (BIGWIDTH × HEIGHT), centered on hatLeft:
        int rectX = hatLeft - (BIGWIDTH / 2);
        int rectY = hatBottom - HEIGHT;
        pen.fillRect(rectX, rectY, BIGWIDTH, HEIGHT);

        
        int baseY      = rectY;
        int leftBaseX  = hatLeft - (SMALLWIDTH / 2);
        int rightBaseX = hatLeft + (SMALLWIDTH / 2);
        int peakX      = hatLeft;
        int peakY      = rectY - HEIGHT;

        // 3) Put those three points into arrays and fill:
        int[] xTriPoints = { leftBaseX, rightBaseX, peakX };
        int[] yTriPoints = { baseY,      baseY,      peakY  };
        pen.fillPolygon(xTriPoints, yTriPoints, 3);
    }
}
