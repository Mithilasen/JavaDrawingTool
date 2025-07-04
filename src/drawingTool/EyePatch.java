// EyePatch.java
package drawingTool;

public class EyePatch extends CircularPart {
    private static final int WIDTH = 30;
    private static final int HEIGHT = 30;
    public static int getEyePatchWidth(){    
    	return WIDTH;
    }		
    public static int getEyePatchHeight(){ 
    	return HEIGHT;
    }
    public EyePatch(){
        super(WIDTH, HEIGHT);
    }
}
