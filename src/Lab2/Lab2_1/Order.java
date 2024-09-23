package Lab2.Lab2_1;

import java.util.ArrayList;

public class Order {
    private ArrayList<Facade> facades;
    private String appointment = "";

    public Order() {
        facades = new ArrayList<>();
    }

    public Order(String appointment) {
        facades = new ArrayList<>();
        this.appointment = appointment;
    }

    public void addFacade(Facade facade) {
        facades.add(facade);
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (Facade facade : facades) {
            totalCost += facade.getPrice();
        }
        return totalCost;
    }

    public void printOrderDetails() {
        if (appointment!= null && !appointment.isEmpty() && !appointment.isBlank()) System.out.println("Order for " + appointment);
        for (Facade facade : facades) {
            System.out.println(facade.getDescription() + " - Area: " + facade.getArea() + " sqm, Price: " + facade.getPrice());
        }
    }
}

