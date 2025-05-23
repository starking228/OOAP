package Module4;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);

        originator.setState("Assembling parts");
        caretaker.save();

        originator.setState("Welding the structure");
        caretaker.save();

        // Припустимо що сталась помилка
        System.out.println("\nError occurred during welding! Need to revert and redo this step.\n");

        caretaker.undo();

        originator.setState("Re-welding the structure");
        caretaker.save();

        originator.setState("Painting");
        caretaker.save();

        System.out.println("\nFinal production line state: " + originator.getState());
    }
}
