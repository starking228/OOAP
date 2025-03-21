package Lab7;

class Device {
    private String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is off");
    }

    public String getName() {
        return name;
    }

    public void getStatus() {
        System.out.println(name + " status: is " + (isOn ? "on" : "off"));
    }
}
