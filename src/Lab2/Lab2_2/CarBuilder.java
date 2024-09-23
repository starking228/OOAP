package Lab2.Lab2_2;

public abstract class CarBuilder {
    protected String name;
    protected String engineType;
    protected double engineCapacity;
    protected boolean hasABS;
    protected boolean hasESP;
    protected int airbags;
    protected boolean hasBoardComputer;
    protected String climateControl;
    protected String interiorTrim;
    protected double price;

    public abstract CarBuilder setEngineType(String engineType);

    public abstract CarBuilder setEngineCapacity(double engineCapacity);

    public abstract CarBuilder setHasABS(boolean hasABS);

    public abstract CarBuilder setHasESP(boolean hasESP);

    public abstract CarBuilder setAirbags(int airbags);

    public abstract CarBuilder setHasBoardComputer(boolean hasBoardComputer);

    public abstract CarBuilder setClimateControl(String climateControl);

    public abstract CarBuilder setInteriorTrim(String interiorTrim);

    public abstract CarBuilder setPrice(double price);

    public abstract Car build();
}
