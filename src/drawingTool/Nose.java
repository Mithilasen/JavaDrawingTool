package drawingTool;


public class Nose extends CircularPart {
    // **These two MUST be `public static final`** so other classes can refer to them.
    private static final int WIDTH  = 10;
    private static final int HEIGHT = 7;
    public static int getNoseWidth(){    
    		return WIDTH;
    }		
    public static int getNoseHeight(){ 
    	return HEIGHT;
    }

    public Nose() {
        
        super(WIDTH, HEIGHT);
    }
}
