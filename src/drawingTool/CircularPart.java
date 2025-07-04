// CircularPart.java
package drawingTool;

public class CircularPart extends BodyPart {
    public CircularPart(int width, int height){
        super(width, height);
    }

    @Override
    void drawAt(int left, int bottom){
        int top = bottom - getHeight();
        Drawing.pen().fillOval(left, top, getWidth(), getHeight());
    }
}
