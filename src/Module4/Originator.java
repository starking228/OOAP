package Module4;

// Originator — об'єкт, який зберігає стан і може його відновити
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
        System.out.println("Status is set: " + state);
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        System.out.println("Saving state: " + state);
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getSavedState();
        System.out.println("Condition restored: " + state);
    }
}
