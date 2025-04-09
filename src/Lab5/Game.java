package Lab5;

public class Game {
    public static void main(String[] args) {
        GameFacade gameFacade = new GameFacade();

        // Створення персонажів
        Character human = new Human("Іhor");
        Character orc = new Orc("Grog");
        Character troll = new Troll("Volodia");

        System.out.println(human.getInfo());
        System.out.println(orc.getInfo());
        System.out.println(troll.getInfo());

        gameFacade.addCharacter(human);
        gameFacade.addCharacter(orc);
        gameFacade.addCharacter(troll);

        human = new PlateArmor(human);
        orc = new Chainmail(orc);

        human = new Sword(human);
        orc = new Axe(orc);
        troll = new Mace(troll);

        gameFacade.addCharacter(human);
        gameFacade.addCharacter(orc);
        gameFacade.addCharacter(troll);

        System.out.println(human.getInfo());
        System.out.println(orc.getInfo());
        System.out.println(troll.getInfo());

        gameFacade.compareStrength(human);
    }
}