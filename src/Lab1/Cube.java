package Lab1;

public class Cube extends Shape implements VolumeCalculable {
    private double sideLength;

    public Cube(double sideLength) {
        super("Cube");
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}

