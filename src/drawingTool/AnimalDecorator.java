package drawingTool;

import java.awt.Point;

public abstract class AnimalDecorator
        implements Animal, LocatedRectangle {

    protected final Animal inner;

    protected AnimalDecorator(Animal inner) { 
    	this.inner = inner;
    	}

    /* -------- Animal -------- */
    @Override public void drawAt(int left, int bottom) {
        inner.drawAt(left, bottom);
        decorate(left, bottom);
    }

    @Override public void draw() {
        inner.draw();
        Point p = ((LocatedRectangle) inner).address();
        decorate(p.x, p.y);
    }

    protected abstract void decorate(int left, int bottom);

    /* ---- LocatedRectangle (pure delegation) ---- */
    @Override 
    public Point address(){ 
    	return ((LocatedRectangle) inner).address();
    	}
    @Override
    public int width() { 
    	return ((LocatedRectangle) inner).width();
    	}
    @Override 
    public int height(){ 
    	return ((LocatedRectangle) inner).height();
    	}
}
