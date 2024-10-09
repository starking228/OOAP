package Modul1;

public class Main {
    public static void main(String[] args) {
        IVehicleFactory fordFactory = new FordExplorerFactory();
        Vehicle fordExplorer = fordFactory.createVehicle();
        fordExplorer.showInfo();

        IVehicleFactory lincolnFactory = new LincolnAviatorFactory("Lincoln Aviator", "White");
        Vehicle lincolnAviator = lincolnFactory.createVehicle();
        lincolnAviator.showInfo();
    }
}