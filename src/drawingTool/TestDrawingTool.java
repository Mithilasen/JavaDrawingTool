package drawingTool;

import java.awt.Dimension;
import javax.swing.JFrame;

public class TestDrawingTool {
    private final JFrame applicationFrame;

    
    public TestDrawingTool(String title) {
        applicationFrame = new JFrame(title);
        applicationFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
        applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);

        applicationFrame.add(new DrawingArea());
        applicationFrame.setVisible(true);
    }

    public static void main(String[] args) {
     
        new TestDrawingTool("My Panda Scene");
    }
}
