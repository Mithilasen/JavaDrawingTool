package drawingTool;

public class Mouth extends BodyPart {
    private static final int WIDTH = 20;
    private static final int HEIGHT = 10;
    private static final int START_ANGLE = 0;
    private static final int ARC_EXTENT = -180;
    public static int getMouthWidth(){    
    		return WIDTH;
    }		
    public static int getMouthHeight(){ 
    	return HEIGHT;
    }
    public static int getstartAngle(){    
    		return START_ANGLE;
    }		
    public static int getarcExtent(){ 
    	return ARC_EXTENT;
    }

    public Mouth() {
        super(WIDTH, HEIGHT);
    }

    @Override
    void drawAt(int left, int bottom) {
        int top = bottom - getHeight();
        Drawing.pen().drawArc(left, top, getWidth(), getHeight(), START_ANGLE, ARC_EXTENT);
    }
}
