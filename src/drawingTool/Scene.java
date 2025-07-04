package drawingTool;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    private final List<Animal> actors = new ArrayList<>();

    public List<Animal> getActors() { return actors; }

    public Scene(int count, int areaW, int areaH) {

        int pandaW = Body.getBodyWidth();
        int pandaH = Body.getBodyHeight() + Head.getHeadHeight();

        int minY = pandaH;
        int maxY = areaH;
        int minX = 0;
        int maxX = Math.max(0, areaW - pandaW);

        for (int i = 0; i < count; i++) {
            int x = RandomNumber.between(minX, maxX);
            int y = RandomNumber.between(minY, maxY);

            Animal cand = new Panda(x, y);   // raw panda only
            if (isVacant(cand)) actors.add(cand);
        }
    }
    Animal ok = new HatDecorator(new HatDecorator(new Panda(200,150)));

    private boolean isVacant(Animal cand) {
        for (Animal other : actors)
            if (((LocatedRectangle) cand).intersects((LocatedRectangle) other))
                return false;
        return true;
    }
}
