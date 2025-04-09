package Lab5;

public class Mace extends WeaponDecorator {
    public Mace(Character character) {
        super(character, 6);
    }

    @Override
    public String getName() {
        return super.getName() + ", with mace";
    }
}
