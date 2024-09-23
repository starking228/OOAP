package Lab3.Lab3_1;

import java.util.ArrayList;

public class BuildingContainer {
    private ArrayList<Building> buildings = new ArrayList<>();

    public void addBuilding(Building building) {
        buildings.add(building.clone());
    }

    public void displayBuildings() {
        for (Building building : buildings) {
            System.out.println(building);
        }
    }
}
