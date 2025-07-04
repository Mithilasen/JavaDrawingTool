// File: drawingTool/BambooDecorator.java
package drawingTool;


public class BambooDecorator extends AnimalDecorator {
    public BambooDecorator(Animal inner) {
        super(inner);
    }

    @Override
    protected void decorate(int left, int bottom) {
        int armY = bottom - DrawingConstants.getArmOffsetY();
        int armL = left - Arm.getArmWidth()/2;

        int bamL = armL + (Arm.getArmWidth() - Bamboo.getWidth())/2;
        int bamB = armY;
        new Bamboo().drawAt(bamL, bamB);
    }
}
