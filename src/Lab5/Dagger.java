package Lab5;

public class Dagger extends WeaponDecorator {
    public Dagger(Character character) {
        super(character, 2);
    }

    @Override
    public String getName() {
        return super.getName() + ", with dagger";
    }
}
