package Lab5;

public class Sword extends WeaponDecorator {
    public Sword(Character character) {
        super(character, 5);
    }

    @Override
    public String getName() {
        return super.getName() + ", with Sword";
    }
}
