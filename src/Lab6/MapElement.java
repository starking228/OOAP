package Lab6;

// конкретний елемент карти
class MapElement extends MapComponent {
    public MapElement(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void draw(int parentX, int parentY) {
        System.out.println("Елемент '" + name + "' на координатах (" + (parentX + x) + ", " + (parentY + y) + ")");
    }
}
