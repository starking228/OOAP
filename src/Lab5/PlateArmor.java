package Lab5;

public class PlateArmor extends ArmorDecorator {
    public PlateArmor(Character character) {
        super(character, 10);
    }

    @Override
    public String getName() {
        return super.getName() + ", with plate armor";
    }
}
