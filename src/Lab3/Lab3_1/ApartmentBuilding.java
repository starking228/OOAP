package Lab3.Lab3_1;

public class ApartmentBuilding extends Building {
    private int numberOfApartments;

    public ApartmentBuilding(double area, int floors, String address, Owner owner, int numberOfApartments) {
        super(area, floors, address, owner);
        this.numberOfApartments = numberOfApartments;
    }

    public int getNumberOfApartments() {
        return numberOfApartments;
    }

    public void setNumberOfApartments(int numberOfApartments) {
        this.numberOfApartments = numberOfApartments;
    }

    @Override
    public Building clone() {
        return new ApartmentBuilding(getArea(), getFloors(), getAddress(), getOwner(), numberOfApartments);
    }

    @Override
    public String toString() {
        return "ApartmentBuilding: " + super.toString() + ", numberOfApartments = " + numberOfApartments;
    }
}

