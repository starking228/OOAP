package Lab1;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Object created!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

