
package drawingTool;


public class StickDecorator extends AnimalDecorator {
    public StickDecorator(Animal inner) {
        super(inner);
    }

    @Override
    protected void decorate(int left, int bottom){
        
        new Stick().drawAt(left + DrawingConstants.getStickOffset() , bottom -DrawingConstants.getStickOffsetY() );
    }
}
