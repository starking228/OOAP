package Lab5;

public class WoodenShield extends ShieldDecorator {
    public WoodenShield(Character character) {
        super(character, 5);
    }

    @Override
    public String getName() {
        return super.getName() + ", with wooden shield";
    }
}
