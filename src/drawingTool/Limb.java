package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Limb extends BodyPart {
	
    public Limb(int width, int height){
        super(width, height);
    }

    @Override
    void drawAt(int left, int bottom) {
        int top = bottom - getHeight();
        Graphics pen = Drawing.pen();

        pen.setColor(Color.BLACK);
        pen.fillRect(left, top, getWidth(), getHeight());
    }
    
}
