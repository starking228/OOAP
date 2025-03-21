package Lab6;

// Базовий інтерфейс для всіх елементів карти
abstract class MapComponent {
    protected String name;
    protected int x, y;

    public MapComponent(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public abstract void draw(int parentX, int parentY);

    public MapComponent findChild(String name) {
        return this.name.equals(name) ? this : null;
    }
}

