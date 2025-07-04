package drawingTool;

import javax.swing.JPanel;
import java.awt.*;
import java.util.List;

// ── bring in the colour decorators ─────────────────────────
import drawingTool.FaceColorDecorator;
import drawingTool.EyeColorDecorator;

public class DrawingArea extends JPanel {

    private Scene scene;
    private int   lastCount = -1;
    private final DrawingToolGUI parent;

    public DrawingArea(DrawingToolGUI parent) {
        this.parent = parent;
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1600, 2200));
    }
    // for TestDrawingTool (no-arg) compatibility
    public DrawingArea() { this(null); }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Drawing.set(g);

        // rebuild scene if pandaCount changed (or default to 5)
        int cnt = (parent != null ? parent.getPandaCount() : 5);
        if (scene == null || cnt != lastCount) {
            lastCount = cnt;
            scene     = new Scene(cnt, getWidth(), getHeight());
        }

        // pull current accessory flags
        boolean hat    = parent != null && parent.isShowHat();
        boolean bamboo = parent != null && parent.isShowBamboo();
        boolean stick  = parent != null && parent.isShowStick();
        boolean tie    = parent != null && parent.isShowTie();

        // pull the random colours (defaults to white/black if no GUI)
        Color faceCol = (parent != null ? parent.getFaceColor() : Color.WHITE);
        Color eyeCol  = (parent != null ? parent.getEyeColor()  : Color.BLACK);

        // draw each panda with colours + accessories
        for (Animal base : scene.getActors()) {
            Animal a = base;

            // ==== 1) apply the random colours first ====
            a = new FaceColorDecorator(a, faceCol);
            a = new EyeColorDecorator(a, eyeCol);

            // ==== 2) then your accessories ====
            if (hat)    a = new HatDecorator(a);
            if (bamboo) a = new BambooDecorator(a);
            if (stick)  a = new StickDecorator(a);
            if (tie)    a = new TieDecorator(a);

            // ==== 3) finally draw it all ====
            a.draw();
        }
    }
}
