package Lab5;

public class MainQuickTest {
    public static void main(String[] args) {
        Character human = new Human("Олег");
        System.out.println(human.getInfo());

        human = new PlateArmor(human);
        System.out.println(human.getInfo());

        human = new Sword(human);
        System.out.println(human.getInfo());

        human = new IronShield(human);
        System.out.println(human.getInfo());
    }
}
