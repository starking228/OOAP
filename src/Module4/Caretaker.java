package Module4;

import java.util.Stack;

// Caretaker — керує історією станів
public class Caretaker {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();
    private Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void save() {
        undoStack.push(originator.saveStateToMemento());
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            Memento currentState = originator.saveStateToMemento();
            redoStack.push(currentState);
            Memento prevState = undoStack.pop();
            originator.getStateFromMemento(prevState);
        } else {
            System.out.println("No states to rollback.");
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Memento nextState = redoStack.pop();
            undoStack.push(originator.saveStateToMemento());
            originator.getStateFromMemento(nextState);
        } else {
            System.out.println("No states to repeat.");
        }
    }
}
