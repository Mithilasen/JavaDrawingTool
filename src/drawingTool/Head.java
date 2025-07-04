// Head.java
package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

public class Head extends CircularPart {
    private static final int WIDTH  = 100;
    private static final int HEIGHT = 100;

    public static int getHeadWidth(){    
    		return WIDTH;
    }		
    public static int getHeadHeight(){ 
    	return HEIGHT;
    }
    private final Ear      leftEar    = new Ear();
    private final Ear      rightEar   = new Ear();
    private final EyePatch leftPatch  = new EyePatch();
    private final EyePatch rightPatch = new EyePatch();
    private final Eye      leftEye    = new Eye();
    private final Eye      rightEye   = new Eye();
    private final Nose     nose       = new Nose();
    private  final Mouth    mouth      = new Mouth();

    public Head() {
        super(WIDTH, HEIGHT);
    }

    @Override
    void drawAt(int left, int bottom) {
        int top = bottom - getHeight();
        Graphics pen = Drawing.pen();

        // 1) head circle
        pen.setColor(Color.WHITE);
        pen.fillOval(left, top, getWidth(), getHeight());
        pen.setColor(Color.BLACK);
        pen.drawOval(left, top, getWidth(), getHeight());

        // 2) ears
        int earBottom = top + DrawingConstants.getEarOffsetY();
        leftEar .drawAt(left - DrawingConstants.getEarOffsetX(),earBottom);
        rightEar.drawAt(left + getWidth() - DrawingConstants.getEarOffsetX(), earBottom);

        // 3) eye-patches
        int patchBottom = top + 30 + EyePatch.getEyePatchHeight();
        pen.setColor(Color.BLACK);
        leftPatch .drawAt(left + 20, patchBottom);
        rightPatch.drawAt(left + 60, patchBottom);

        // 4) eyeballs + pupils
        int eyeBottom = patchBottom - 5;
        // draw white eyeball, then let Eye.drawAt paint pupil
        pen.setColor(Color.WHITE);
        leftEye .drawAt(left + 20 + (EyePatch.getEyePatchWidth() - Eye.getEyeWidth()) / 2,  eyeBottom);
        pen.setColor(Color.WHITE);
        rightEye.drawAt(left + 60 + (EyePatch.getEyePatchWidth() - Eye.getEyeWidth()) / 2,  eyeBottom);

        // 5) nose
        int noseBottom = top + (int)(getHeight() * 0.55) + Nose.getNoseHeight();
        pen.setColor(Color.BLACK);
        nose.drawAt(left + (getWidth() - Nose.getNoseWidth()) / 2, noseBottom);

        // 6) mouth
        pen.setColor(Color.BLACK);
        mouth.drawAt(left + (getWidth() - Mouth.getMouthWidth()) / 2, noseBottom + Mouth.getMouthHeight());
    }
}
