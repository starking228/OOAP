package Lab5;

import java.util.ArrayList;
import java.util.List;

// Фасад для керування грою
class GameFacade {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void compareStrength(Character hero) {
        System.out.println("Comparing strength of " + hero.getName());
        for (Character c : characters) {
            if (!c.equals(hero)) {
                if (c.getStrength() > hero.getStrength()) {
                    System.out.println(c.getName() + " is stronger than " + hero.getName());
                } else if (hero.getStrength() > c.getDefense()) {
                    System.out.println(hero.getName() + " can defeat " + c.getName() + " in 1 hit");
                } else if (hero.getStrength() * 5 > c.getDefense()) {
                    System.out.println(hero.getName() + " can defeat " + c.getName() + " in 5 hits");
                } else if (hero.getStrength() * 10 > c.getDefense()) {
                    System.out.println(hero.getName() + " can defeat " + c.getName() + " in 10 hits");
                }
            }
        }
    }
}