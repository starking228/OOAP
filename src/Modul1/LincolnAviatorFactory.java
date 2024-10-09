package Modul1;

class LincolnAviatorFactory implements IVehicleFactory {
    private final String model;
    private final String color;

    public LincolnAviatorFactory(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public Vehicle createVehicle() {
        return new LincolnAviator(model, color);
    }
}
