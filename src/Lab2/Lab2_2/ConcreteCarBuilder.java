package Lab2.Lab2_2;

public class ConcreteCarBuilder extends CarBuilder {

    public ConcreteCarBuilder(String name) {
        this.name = name;
    }

    @Override
    public CarBuilder setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    @Override
    public CarBuilder setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
        return this;
    }

    @Override
    public CarBuilder setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
        return this;
    }

    @Override
    public CarBuilder setHasESP(boolean hasESP) {
        this.hasESP = hasESP;
        return this;
    }

    @Override
    public CarBuilder setAirbags(int airbags) {
        this.airbags = airbags;
        return this;
    }

    @Override
    public CarBuilder setHasBoardComputer(boolean hasBoardComputer) {
        this.hasBoardComputer = hasBoardComputer;
        return this;
    }

    @Override
    public CarBuilder setClimateControl(String climateControl) {
        this.climateControl = climateControl;
        return this;
    }

    @Override
    public CarBuilder setInteriorTrim(String interiorTrim) {
        this.interiorTrim = interiorTrim;
        return this;
    }

    @Override
    public CarBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    @Override
    public Car build() {
        return new Car(this);
    }
}
