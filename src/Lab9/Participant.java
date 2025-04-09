package Lab9;

// Учасник аукціону
class Participant implements Observer {
    private String name;

    public Participant(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " get message: " + message);
    }

    public String getName() {
        return name;
    }
}
