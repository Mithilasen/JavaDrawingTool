
package drawingTool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.EventQueue;

public class DrawingToolGUI extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    private final DrawingArea drawingArea;
    private final JPanel      controlPanel;

   
    private int     pandaCount = 5;
    private boolean showHat    = false;
    private boolean showBamboo = false;
    private boolean showStick  = false;
    private boolean showTie    = false;
    private Color   faceColor  = Color.WHITE;
    private Color   eyeColor   = Color.BLACK;

   
    private final JSpinner countSpinner;

 
    public DrawingToolGUI(String title) {
        this();
        setTitle(title);
    }

  
    public DrawingToolGUI() {
        super("Decorator Panda Lab");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // ── Control panel ────────────────────────────────────
        controlPanel = new JPanel();

        // Panda count spinner + button
        controlPanel.add(new JLabel("Count:"));
        countSpinner = new JSpinner(new SpinnerNumberModel(pandaCount, 1, 100, 1));
        controlPanel.add(countSpinner);
        JButton setCountBtn = new JButton("Set Count");
        setCountBtn.setActionCommand("setCount");
        setCountBtn.addActionListener(this);
        controlPanel.add(setCountBtn);

        // Accessory toggles
        JCheckBox hatCB = new JCheckBox("Hat");
        hatCB.setActionCommand("toggleHat");
        hatCB.addActionListener(this);
        controlPanel.add(hatCB);

        JCheckBox bambooCB = new JCheckBox("Bamboo");
        bambooCB.setActionCommand("toggleBamboo");
        bambooCB.addActionListener(this);
        controlPanel.add(bambooCB);

        JCheckBox stickCB = new JCheckBox("Stick");
        stickCB.setActionCommand("toggleStick");
        stickCB.addActionListener(this);
        controlPanel.add(stickCB);

        JCheckBox tieCB = new JCheckBox("Tie");
        tieCB.setActionCommand("toggleTie");
        tieCB.addActionListener(this);
        controlPanel.add(tieCB);

        // Random colours button
        JButton randCols = new JButton("Random Colours");
        randCols.setActionCommand("randomCols");
        randCols.addActionListener(this);
        controlPanel.add(randCols);

        add(controlPanel, BorderLayout.NORTH);

        // ── Drawing area ─────────────────────────────────────
        drawingArea = new DrawingArea(this);
        add(drawingArea, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

   
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "setCount":
                // read spinner value and update pandaCount
                pandaCount = (Integer) countSpinner.getValue();
                break;

            case "toggleHat":
                showHat = !showHat;
                break;
            case "toggleBamboo":
                showBamboo = !showBamboo;
                break;
            case "toggleStick":
                showStick = !showStick;
                break;
            case "toggleTie":
                showTie = !showTie;
                break;

            case "randomCols":
                faceColor = new Color(RandomNumber.between(0,255),RandomNumber.between(0,255),RandomNumber.between(0,255));
                eyeColor = new Color(RandomNumber.between(0,255), RandomNumber.between(0,255),RandomNumber.between(0,255));
                break;

            default:
                // no action
        }
        drawingArea.repaint();
    }

    // ── Getters for DrawingArea ─────────────────────────────

    public int getPandaCount(){
    	return pandaCount;
    	}
    public boolean isShowHat(){
    	return showHat;
    	}
    public boolean isShowBamboo(){ 
    	return showBamboo;
    	}
    public boolean isShowStick(){
    	return showStick;
    	}
    public boolean isShowTie(){
    	return showTie;
    	}
    public Color getFaceColor(){
    	return faceColor;
    	}
    public Color getEyeColor(){
    	return eyeColor;
    	}

    /**
     * Launches the full GUI as a standalone application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new DrawingToolGUI("My Panda Scene"));
    }
}
