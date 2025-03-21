package Lab5;

// Конкретні класи броні
public class Chainmail extends ArmorDecorator {
    public Chainmail(Character character) {
        super(character, 5);
    }

    @Override
    public String getName() {
        return super.getName() + " with chainmail";
    }
}
