package Lab5;

public class Axe extends WeaponDecorator {
    public Axe(Character character) {
        super(character, 7);
    }

    @Override
    public String getName() {
        return super.getName() + " with axe";
    }
}
