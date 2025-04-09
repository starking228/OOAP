package Lab5;

abstract class ShieldDecorator extends Character {
    public Character character;

    @Override
    public String getName() {
        return super.getName();
    }

    public ShieldDecorator(Character character, int shieldBonus) {
        super(character.getName(), character.getStrength(), character.getDefense() + shieldBonus);
        this.character = character;
    };
}

