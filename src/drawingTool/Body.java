// Body.java
package drawingTool;

import java.awt.Color;
import java.awt.Graphics;


public class Body extends BodyPart {
    private static final int WIDTH  = 120;
private static final int HEIGHT = 180;
   
    private final Arm leftArm = new Arm();
    private final Arm rightArm = new Arm();
    private final Leg leftLeg = new Leg();
    private final Leg rightLeg = new Leg();
    
    public static int getBodyWidth(){    
    		return WIDTH;
    }		
    public static int getBodyHeight(){ 
    	return HEIGHT;
    }
    
    
    public Body() {
        super(WIDTH, HEIGHT);
    }

    @Override
    public void drawAt(int left, int bottom) {
        Graphics g = Drawing.pen();

        
        g.setColor(Color.WHITE);
        g.fillOval(left, bottom - getHeight(), getWidth(), getHeight());

        g.setColor(Color.BLACK);
        g.drawOval(left, bottom - getHeight(), getWidth(), getHeight());

      
        int armY = bottom - (getHeight() * 2 / 3);          
        int leftArmX  = left - Arm.getArmWidth() / 2;    
        int rightArmX = left + getWidth() - Arm.getArmWidth()/2;

        leftArm.drawAt(leftArmX, armY);
        rightArm.drawAt(rightArmX, armY);

       
        int legY = bottom;                                 
        int gap  = 8;                                     
        int leftLegX  = left + gap;
        int rightLegX = left + getWidth() - Leg.getLegWidth() - gap;

        leftLeg.drawAt (leftLegX,  legY);
        rightLeg.drawAt(rightLegX, legY);
    }
       
}
