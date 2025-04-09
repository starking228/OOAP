package Lab2.Lab2_1;

public class ShowCase implements Facade {
    private double area;
    private double pricePerSquareMeter;

    public ShowCase(double area, double pricePerSquareMeter) {
        this.area = area;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    @Override
    public String getDescription() {
        return "Showcase facade";
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPrice() {
        return area * pricePerSquareMeter;
    }
}
