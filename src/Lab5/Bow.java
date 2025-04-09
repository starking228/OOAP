package Lab5;

// Конкретні класи зброї
public class Bow extends WeaponDecorator {
    public Bow(Character character) {
        super(character, 3);
    }

    @Override
    public String getName() {
        return super.getName() + " with bow";
    }
}
