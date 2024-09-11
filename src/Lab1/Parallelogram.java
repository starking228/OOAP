package Lab1;

public class Parallelogram extends Shape {
    private double base;
    private double height;

    public Parallelogram(double base, double height) {
        super("Parallelogram");
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

