package Lab7;

import java.util.Stack;

class SmartRoomController {
    private Stack<Command> history = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        history.push(command);
    }

    public void undoLastCommand() {
        if (!history.isEmpty()) {
            history.pop().undo();
        } else {
            System.out.println("No commands to cancel");
        }
    }
}
