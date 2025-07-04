package drawingTool;

public final class DrawingConstants {
    private DrawingConstants(){
    	
    } 

    // ── EAR OFFSETS ───────────────────────────────────
    private static final int EAR_OFFSET_X = 15;
    private static final int EAR_OFFSET_Y = 30;

        private static final int HEAD_OFFSET_X = (Body.getBodyWidth() - Head.getHeadWidth()) / 2;
    private static final int ARM_OFFSET_Y  = Body.getBodyHeight() / 2;
    private static final int LEG_OFFSET_X  = 60;

  
    private static final int LEFT_LEG_OFFSET_X = 25;

        private static final int BAMBOO_MIN_HEIGHT = 40;
    private static final int BAMBOO_MAX_HEIGHT = 80;
    private static final int BAMBOO_OFFSET_Y   = 25;

    private static final int TAIL_OFFSET_X = Body.getBodyWidth() - Tail.getTailWidth()-20;
    private static final int TAIL_OFFSET_Y = Tail.getTailHeight() / 2;

    private static final int HAT_OFFSET   = 15;
    private static final int STICK_OFFSET = 110;
    private static final int STICK_OFFSET_Y = 100;

    private static final int TIE_WIDTH      = 20;
    private static final int TIE_HEIGHT     = 60;
    private static final int TIE_TIP_BOTTOM = 80;
    private static final int TIE_OFFSET_X   = 55;
    private static final int TIE_OFFSET_Y   = 150;
    
    private static final int EYE_OFFSET_Y = 15;

    private static final int BODYOFFSETY = 125; 
    // ── PUBLIC GETTERS ────────────────────────────────

    public static int getEarOffsetX(){
        return EAR_OFFSET_X;
        }
    public static int getEarOffsetY(){
    	return EAR_OFFSET_Y;
    	}

    public static int getHeadOffsetX(){
    	return HEAD_OFFSET_X;
    	}
    public static int getArmOffsetY(){
    	return ARM_OFFSET_Y;
    	}
    public static int getLegOffsetX(){
    	return LEG_OFFSET_X;
    	}
    public static int getLeftLegOffsetX(){
    	return LEFT_LEG_OFFSET_X;
    	}
    public static int getBambooMinHeight(){
    	return BAMBOO_MIN_HEIGHT;
    	}
    public static int getBambooMaxHeight(){ 
    	return BAMBOO_MAX_HEIGHT;
    	}
    public static int getBambooOffsetY(){ 
    	return BAMBOO_OFFSET_Y;
    	}   
    public static int getTailOffsetX(){
    	return TAIL_OFFSET_X;
    	}
    public static int getTailOffsetY(){
    	return TAIL_OFFSET_Y;
    	}  
    public static int getHatOffset(){
    	return HAT_OFFSET;
    	}
    public static int getStickOffset(){
    	return STICK_OFFSET;
    	} 
    public static int getTieWidth(){
    	return TIE_WIDTH;
    	}
    public static int getTieHeight(){
    	return TIE_HEIGHT;
    	}
    public static int getTieTipBottom(){
    	return TIE_TIP_BOTTOM;
    	}
    public static int getTieOffsetX(){
    	return TIE_OFFSET_X;
    	}
    public static int getTieOffsetY(){
    	return TIE_OFFSET_Y;
    	}    
    public static int getEyeOffsetY(){
    	return EYE_OFFSET_Y;
    	}   
    public static int getBodyOffsetY(){
    	return BODYOFFSETY;
    	}
    public static int getStickOffsetY(){
    	return STICK_OFFSET_Y;
    	}
}
