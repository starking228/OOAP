package Lab2.Lab2_2;

import java.util.ArrayList;

// Будівельник
public class Main {
    public static void main(String[] args) {
        ArrayList<Car> CompletsSet = new ArrayList<>();
        // 1
        CompletsSet.add(new ConcreteCarBuilder("Basic")
                .setEngineType("Gasoline")
                .setEngineCapacity(1.6)
                .setHasABS(true)
                .setHasESP(false)
                .setAirbags(2)
                .setHasBoardComputer(false)
                .setClimateControl("Air conditioning")
                .setInteriorTrim("Cloth")
                .setPrice(15000)
                .build());

        // 2
        CompletsSet.add(new ConcreteCarBuilder("Standart")
                .setEngineType("Gasoline")
                .setEngineCapacity(1.8)
                .setHasABS(true)
                .setHasESP(true)
                .setAirbags(4)
                .setHasBoardComputer(true)
                .setClimateControl("Air conditioning")
                .setInteriorTrim("Cloth")
                .setPrice(18000)
                .build());

        // 3
        CompletsSet.add(new ConcreteCarBuilder("Improved")
                .setEngineType("Diesel")
                .setEngineCapacity(2.0)
                .setHasABS(true)
                .setHasESP(true)
                .setAirbags(6)
                .setHasBoardComputer(true)
                .setClimateControl("Climate control")
                .setInteriorTrim("leather")
                .setPrice(22000)
                .build());

        // 4
        CompletsSet.add(new ConcreteCarBuilder("Premium")
                .setEngineType("Diesel")
                .setEngineCapacity(2.2)
                .setHasABS(true)
                .setHasESP(true)
                .setAirbags(8)
                .setHasBoardComputer(true)
                .setClimateControl("Climate control")
                .setInteriorTrim("leather")
                .setPrice(30000)
                .build());

        for (Car current : CompletsSet) System.out.println(current);
    }
}


