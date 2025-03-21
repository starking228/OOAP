package Lab5;

// Абстрактний декоратор для зброї
abstract class WeaponDecorator extends Character {
    protected Character character;

    public WeaponDecorator(Character character, int weaponBonus) {
        super(character.getName(), character.getStrength() + weaponBonus, character.getDefense());
        this.character = character;
    }
}
