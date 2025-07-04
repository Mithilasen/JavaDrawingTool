package drawingTool;

import javax.swing.*;
import java.awt.*;

public class PandaDecoratorGridTest extends JFrame {

    public PandaDecoratorGridTest() {
        super("Panda Decorator Grid Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1600, 1200);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 3, 20, 20));

        boolean[][] combos = {
            { true,  false, false, false },
            { false, true,  false, false },
            { false, false, true,  false },
            { false, false, false, true  },
            { true,  true,  true,  false },
            { false, true,  true,  true  }
        };

        for (boolean[] combo : combos) {
            add(new PandaCell(combo));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PandaDecoratorGridTest().setVisible(true));
    }

    private static class PandaCell extends JPanel {
        private static final int MARGIN = 10;
        private static final Color FACE_COLOR = Color.PINK;
        private static final Color EYE_COLOR  = Color.BLUE;
        private final boolean hat, bamboo, stick, tie;

        PandaCell(boolean[] combo) {
            this.hat    = combo[0];
            this.bamboo = combo[1];
            this.stick  = combo[2];
            this.tie    = combo[3];
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Drawing.set(g);

            // Anchor panda at bottom-left of this cell
            int x = MARGIN;
            int y = getHeight() - MARGIN;   // ← draw bottom of panda this far above the bottom

            Animal a = new Panda(x, y);
            // apply face+eye colours
            a = new FaceColorDecorator(a, FACE_COLOR);
            a = new EyeColorDecorator(a, EYE_COLOR);
            // then accessories
            if (hat)    a = new HatDecorator(a);
            if (bamboo) a = new BambooDecorator(a);
            if (stick)  a = new StickDecorator(a);
            if (tie)    a = new TieDecorator(a);
            a.draw();
        }
    }
}
