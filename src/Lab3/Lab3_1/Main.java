package Lab3.Lab3_1;

// Прототип
public class Main {
    public static void main(String[] args) {
        BuildingContainer buildings = new BuildingContainer();

        Owner owner1 = new Owner("Ihor Chychula", "09676848444");
        Owner owner2 = new Owner("Ne Ihor Chychula", "096756344002");

        Building apartmentBuilding = new ApartmentBuilding(1000, 10, "Lviv ...", owner1, 20);
        Building cottage = new Cottage(300, 2, "Drohobych ...", owner2, true);

        buildings.addBuilding(apartmentBuilding);
        buildings.addBuilding(cottage);
        buildings.addBuilding(apartmentBuilding.clone());
        buildings.addBuilding(cottage.clone());

        buildings.displayBuildings();
    }
}
