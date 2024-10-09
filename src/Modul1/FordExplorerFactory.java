package Modul1;

class FordExplorerFactory implements IVehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FordExplorer();
    }
}
