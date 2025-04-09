package Lab10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Створення юнітів
        Unit wanderer = new Unit("Wanderer",
                new ForestTraversal(),
                new MountainTraversal());

        Unit shaman = new Unit("Shaman",
                new RiverTraversal(),
                new ForestTraversal());

        Unit monk = new Unit("Monk",
                new EclipseTraversal(),
                new RiverTraversal());

        // Всі можливі сценарії (по 1 локації)
        String[] allLocations = {"Forest", "mountains", "river", "eclipse"};

        // Випадковий вибір 2 різних локацій
        List<String> scenaries = new ArrayList<>(Arrays.asList(allLocations));
        Collections.shuffle(scenaries);
        List<String> questLocations = scenaries.subList(0, 2);

        System.out.println("== GAME 'DARK FOREST' ==\n");
        System.out.println("🎯 2 random locations have been selected for the quest:");
        for (String loc : questLocations) {
            System.out.println("→ " + loc);
        }

        System.out.println("\n=== Passage ===\n");

        Unit[] units = {wanderer, shaman, monk};

        for (Unit unit : units) {
            System.out.println("🔹 Unit: " + unit.getName());
            boolean victory = true;

            for (String location : questLocations) {
                boolean success = unit.tryToTraverse(location);
                if (!success) {
                    victory = false;
                }
                System.out.println("---");
            }

            if (victory) {
                System.out.println("🏆 " + unit.getName() + " pass both location! Victory!\n");
            } else {
                System.out.println("❌ " + unit.getName() + " could not complete the quest.\n");
            }

            System.out.println("=====================\n");
        }
    }
}
