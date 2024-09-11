package Lab1;

public class Pyramid extends Shape implements VolumeCalculable {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        super("Pyramid");
        this.baseArea = baseArea;
        this.height = height;
    }

    public double getBaseArea() {
        return baseArea;
    }

    public void setBaseArea(double baseArea) {
        this.baseArea = baseArea;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * baseArea * height;
    }
}

