package drawingTool;

public interface Animal {
    /** draw with a new anchor (left = x, bottom = y) */
    void drawAt(int left, int bottom);

    /** draw again at the anchor this instance already remembers */
    default void draw() {
    	/* default no-op – concrete classes may override */
    	}
}
