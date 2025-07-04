package drawingTool;

import java.awt.Graphics;
import java.awt.Point;

public class Panda implements Animal, LocatedRectangle {

    private final int left;
    private final int bottom;

    private final Body body = new Body();
    private final Head head = new Head();

    public Panda(int left, int bottom){
    	this.left = left; this.bottom = bottom;
    }

    /* LocatedRectangle */
    @Override
    public Point address(){
    	return new Point(left, bottom);
    	}
    @Override
    public int width(){
    	return Body.getBodyWidth();
    	}
    @Override
    public int height(){
    	return Body.getBodyHeight() + Head.getHeadHeight();
    	}

    /* Animal */
    @Override 
    public void draw(){
    	drawAt(left, bottom);
    	}

    @Override
    public void drawAt(int lx, int by) {
        Graphics g = Drawing.pen();
        body.drawAt(lx, by);
        head.drawAt(lx + DrawingConstants.getHeadOffsetX(),by - Body.getBodyHeight());           // (minus) head above body
    }
}
