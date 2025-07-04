package drawingTool;

import java.awt.Color;
import java.awt.Graphics;


public class Tie extends BodyPart {
    public static final int WIDTH  = 12;  // horizontal span of the tie’s bottom
    public static final int HEIGHT = 20; 
    

    public Tie() {
        super(WIDTH, HEIGHT);
    }

  
    @Override
    public void drawAt(int tieLeft, int tieBottom) {
        Graphics pen = Drawing.pen();
        pen.setColor(Color.RED);

        // 1) Compute top of the tie (knot tip) and heights
        int tieTopY       = tieBottom - HEIGHT;       
        int knotHeight    = HEIGHT / 2;               
        int diamondHeight = HEIGHT - knotHeight;      
        int knotBaseY     = tieTopY + knotHeight;     
        int diamondMidY   = knotBaseY + (diamondHeight / 2); 
        
        int knotTipX   = tieLeft + (WIDTH / 2);       // center x of the knot tip
        int knotTipY   = tieTopY;                     // y = top of the tie
        int knotLeftX  = tieLeft;                     // left x of knot’s base
        int knotRightX = tieLeft + WIDTH;             // right x of knot’s base

       
        int[] knotXPoints = { knotTipX, knotLeftX, knotRightX };
        int[] knotYPoints = { knotBaseY, knotTipY,  knotTipY  };
        pen.fillPolygon(knotXPoints, knotYPoints, 3);

       
        int diamondTopY    = knotBaseY;               
        int diamondLeftY   = diamondMidY;            
        int diamondRightY  = diamondMidY;            
        int diamondBottomY = tieBottom;              
        
        int[] diamondXPoints = {knotTipX,knotTipX - DrawingConstants.getTieWidth(),knotTipX,knotTipX + DrawingConstants.getTieWidth() };
        int[] diamondYPoints = {knotBaseY,knotBaseY + DrawingConstants.getTieHeight() ,knotBaseY + DrawingConstants.getTieTipBottom(), knotBaseY + DrawingConstants.getTieHeight()};
        pen.fillPolygon(diamondXPoints, diamondYPoints, 4);
    }
}
