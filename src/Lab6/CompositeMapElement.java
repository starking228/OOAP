package Lab6;

import java.util.ArrayList;
import java.util.List;

// Елемент контейнер
class CompositeMapElement extends MapComponent {
    private List<MapComponent> children = new ArrayList<>();

    public CompositeMapElement(String name, int x, int y) {
        super(name, x, y);
    }

    public void addComponent(MapComponent component) {
        children.add(component);
    }

    @Override
    public void draw(int parentX, int parentY) {
        int absoluteX = parentX + x;
        int absoluteY = parentY + y;
        System.out.println("Group '" + name + "' Coordinates: (" + absoluteX + ", " + absoluteY + ")");
        for (MapComponent component : children) {
            component.draw(absoluteX, absoluteY);
        }
    }

    @Override
    public MapComponent findChild(String name) {
        if (super.findChild(name) != null) {
            return this;
        }
        for (MapComponent component : children) {
            MapComponent found = component.findChild(name);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
