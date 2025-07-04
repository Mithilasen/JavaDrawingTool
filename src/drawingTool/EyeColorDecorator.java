package drawingTool;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Paints the eyeballs in eyeColor on top of the patches.
 */
public class EyeColorDecorator extends AnimalDecorator {
    private final Color eyeColor;

    public EyeColorDecorator(Animal inner, Color eyeColor) {
        super(inner);
        this.eyeColor = eyeColor;
    }

    @Override
    protected void decorate(int left, int bottom) {
        Graphics pen = Drawing.pen();

        // Compute where the head and patches sit
        int headBottom = bottom - Body.getBodyHeight();
        int headLeft   = left + DrawingConstants.getHeadOffsetX();
        int patchBottom = headBottom - Head.getHeadHeight() + 30 + EyePatch.getEyePatchHeight();

        // Eyeball vertical position (5px above patch bottom)
        int eyeY = patchBottom - DrawingConstants.getEyeOffsetY();
        int exOff = (EyePatch.getEyePatchWidth() - Eye.getEyeWidth()) / 2;

        // Draw colored eyeballs
        pen.setColor(eyeColor);
        pen.fillOval(headLeft + 20 + exOff, eyeY, Eye.getEyeWidth(),Eye.getEyeHeight());
        
        pen.fillOval(headLeft + 60 + exOff,eyeY,Eye.getEyeWidth(), Eye.getEyeHeight());
    }
}
