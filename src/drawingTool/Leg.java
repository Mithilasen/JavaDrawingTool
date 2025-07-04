// Leg.java
package drawingTool;

public class Leg extends Limb {
    private static final int WIDTH  = 20;
    private static final int HEIGHT = 50;
    public static int getLegWidth(){    
    		return WIDTH;
    }		
    public static int getLegHeight(){ 
    	return HEIGHT;
    }
    
    public Leg(){
        super(WIDTH, HEIGHT);
    }
}
