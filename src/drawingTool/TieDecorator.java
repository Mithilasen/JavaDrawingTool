
package drawingTool;


public class TieDecorator extends AnimalDecorator {
    public TieDecorator(Animal inner) {
        super(inner);
    }

    @Override
    protected void decorate(int left, int bottom) {
        
        new Tie().drawAt(left + DrawingConstants.getTieOffsetX(), bottom -DrawingConstants.getTieOffsetY());
    }
}
