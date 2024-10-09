package Modul1;

class FordExplorer extends Vehicle {
    private final String model;
    private final String color;

    public FordExplorer() {
        this.model = "Ford Explorer";
        this.color = "Black";
    }

    @Override
    public void showInfo() {
        System.out.println("Model: " + model + ", Color: " + color);
    }
}
