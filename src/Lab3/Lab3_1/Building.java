package Lab3.Lab3_1;

public abstract class Building extends Prototype {
    private double area;
    private int floors;
    private String address;
    private Owner owner;
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Building(double area, int floors, String address, Owner owner) {
        this.area = area;
        this.floors = floors;
        this.address = address;
        this.owner = owner;
    }

    @Override
    public abstract Building clone();

    @Override
    public String toString() {
        return "area =" + area + ", floors = " + floors + ", address ='" + address + "', " + owner;
    }
}

