package Lab2.Lab2_2;

class Car {
    private String name;
    private String engineType;
    private double engineCapacity;
    private boolean hasABS;
    private boolean hasESP;
    private int airbags;
    private boolean hasBoardComputer;
    private String climateControl;
    private String interiorTrim;
    private double price;

    public Car(CarBuilder builder) {
        this.name = builder.name;
        this.engineType = builder.engineType;
        this.engineCapacity = builder.engineCapacity;
        this.hasABS = builder.hasABS;
        this.hasESP = builder.hasESP;
        this.airbags = builder.airbags;
        this.hasBoardComputer = builder.hasBoardComputer;
        this.climateControl = builder.climateControl;
        this.interiorTrim = builder.interiorTrim;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Complete set: " + name + "\n" +
                "Type of engine: " + engineType + "\n" +
                "Volume of engine: " + engineCapacity + " л\n" +
                "ABS: " + (hasABS ? "Yes" : "No") + "\n" +
                "ESP: " + (hasESP ? "Yes" : "No") + "\n" +
                "Number of airbags: " + airbags + "\n" +
                "On-board computer: " + (hasBoardComputer ? "Yes" : "No") + "\n" +
                "Climate system: " + climateControl + "\n" +
                "Interior trim: " + interiorTrim + "\n" +
                "Price: " + price + " USD\n";
    }
}
