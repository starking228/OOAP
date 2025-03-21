package Lab5;

abstract class ArmorDecorator extends Character {
    public Character character;

    @Override
    public String getName() {
        return super.getName();
    }

    public ArmorDecorator(Character character, int armorBonus) {
        super(character.getName(), character.getStrength(), character.getDefense() + armorBonus);
        this.character = character;
    };
}

