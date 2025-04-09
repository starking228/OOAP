package Lab6;

import java.util.Scanner;

class CityMap {
    public static void main(String[] args) {
        CompositeMapElement city = new CompositeMapElement("City", 0, 0);
        CompositeMapElement districtA = new CompositeMapElement("District A", 10, 20);
        MapElement houseA1 = new MapElement("House A1", 5, 5);
        MapElement houseA2 = new MapElement("House A2", 15, 10);

        CompositeMapElement districtB = new CompositeMapElement("District B", 30, 20);
        MapElement houseB1 = new MapElement("House B1", 50, 5);
        MapElement houseB2 = new MapElement("House B2", 15, 40);


        districtA.addComponent(houseA1);
        districtA.addComponent(houseA2);
        city.addComponent(districtA);

        districtB.addComponent(houseB1);
        districtB.addComponent(houseB2);
        city.addComponent(districtB);

        // Відображення всієї карти
        city.draw(0, 0);



        // Пошук елемента
        MapComponent found = city.findChild(getName());
        if (found != null) {
            System.out.println("Found: " + found.name);
        } else {
            System.out.println("Element not found");
        }
    }

    private static String getName() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, enter name of searched element");
            String choice = scanner.nextLine();
            if (choice.isEmpty() || choice.isBlank()) {
                System.out.println("Invalid name of disctrict or house");
                return getName();
            }
            else return choice.trim();
    }
}
