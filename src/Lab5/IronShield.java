package Lab5;

public class IronShield extends ShieldDecorator {
    public IronShield(Character character) {
        super(character, 10);
    }

    @Override
    public String getName() {
        return super.getName() + ", with iron shield";
    }
}
