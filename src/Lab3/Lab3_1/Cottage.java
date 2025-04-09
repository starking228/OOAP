package Lab3.Lab3_1;

public class Cottage extends Building {
    private boolean hasGarden;

    public Cottage(double area, int floors, String address, Owner owner, boolean hasGarden) {
        super(area, floors, address, owner);
        this.hasGarden = hasGarden;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public Building clone() {
        return new Cottage(getArea(), getFloors(), getAddress(), getOwner(), hasGarden);
    }

    @Override
    public String toString() {
        return "Cottage: " + super.toString() + ", hasGarden=" + hasGarden;
    }
}

