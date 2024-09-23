package Lab2.Lab2_1;

public class PlasticFacadeFactory implements FacadeFactory {
    @Override
    public Facade createSolidFacade(double area, double pricePerSquareMeter) {
        return new SolidFacade(area, pricePerSquareMeter);
    }

    @Override
    public Facade createShowcaseFacade(double area, double pricePerSquareMeter) {
        return new ShowCase(area, pricePerSquareMeter);
    }
}
