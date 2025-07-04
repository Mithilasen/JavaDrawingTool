package drawingTool;


public class Arm extends Limb {
    private static final int WIDTH  = 15;
    private static final int HEIGHT = 40;

    public Arm() {
        super(WIDTH,HEIGHT);
    }
    
    public static int getArmWidth(){    
    		return WIDTH;
    }	
    
    public static int getArmHeight(){ 
    	return HEIGHT;
    }
}
