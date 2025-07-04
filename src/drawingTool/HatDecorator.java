package drawingTool;

public class HatDecorator extends AnimalDecorator {
    public HatDecorator(Animal inner) {
        super(inner);
    }

    @Override
    protected void decorate(int left, int bottom) {
        int headB = bottom - Body.getBodyHeight();
        int headL = left   + DrawingConstants.getEarOffsetX();
        int headT = headB  - Head.getHeadHeight();

        int brimL  = headL+ (Head.getHeadWidth() - Hat.getsmallWidth())/2 + DrawingConstants.getHatOffset();
        int brimB  = headT;
        new Hat().drawAt(brimL, brimB);
    }
}
