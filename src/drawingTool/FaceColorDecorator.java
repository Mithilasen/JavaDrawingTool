package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Fills the head circle with faceColor, then
 * re-draws the head’s built-in face features.
 */
public class FaceColorDecorator extends AnimalDecorator {
    private final Color faceColor;

    public FaceColorDecorator(Animal inner, Color faceColor){
        super(inner);
        this.faceColor = faceColor;
    }

    @Override
    protected void decorate(int left, int bottom){
        Graphics pen = Drawing.pen();

        // Compute where the head was drawn
        int headBottom = bottom - Body.getBodyHeight();
        int headLeft   = left + DrawingConstants.getHeadOffsetX();

        // 1) Fill head circle
        pen.setColor(faceColor);
        pen.fillOval(headLeft,headBottom - Head.getHeadHeight(),Head.getHeadWidth(),Head.getHeadHeight());

        // 2) Redraw head outline
        pen.setColor(Color.BLACK);
        pen.drawOval( headLeft,headBottom - Head.getHeadHeight(),Head.getHeadWidth(), Head.getHeadHeight());

        // 3) Redraw eye-patches
        EyePatch patch = new EyePatch();
        int patchY = headBottom - Head.getHeadHeight() + 30 + EyePatch.getEyePatchHeight();
        pen.setColor(Color.BLACK);
        patch.drawAt(headLeft + 20, patchY);
        patch.drawAt(headLeft + 60, patchY);

        // 4) Redraw nose
        Nose nose = new Nose();
        int noseY = headBottom - Head.getHeadHeight()+ (int)(Head.getHeadHeight() * 0.55)+ nose.getHeight();
        pen.setColor(Color.BLACK);
        nose.drawAt(headLeft + (Head.getHeadWidth() - nose.getWidth())/2, noseY);

        // 5) Redraw mouth
        Mouth mouth = new Mouth();
        pen.setColor(Color.BLACK);
        mouth.drawAt(headLeft + (Head.getHeadWidth() - Mouth.getMouthWidth())/2,noseY + mouth.getHeight());
    }
}
