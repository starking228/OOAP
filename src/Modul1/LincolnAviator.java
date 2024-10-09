package Modul1;

class LincolnAviator extends Vehicle {
    private final String model;
    private final String color;

    public LincolnAviator(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}
