package Lab7;

class TurnOffCommand implements Command {
    private Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    public void execute() {
        device.turnOff();
    }

    public void undo() {
        device.turnOn();
    }
}
