package Lab2.Lab2_1;

public interface FacadeFactory {
    Facade createSolidFacade(double area, double pricePerSquareMeter);
    Facade createShowcaseFacade(double area, double pricePerSquareMeter);

}
