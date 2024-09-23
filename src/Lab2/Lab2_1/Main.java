package Lab2.Lab2_1;

// Абстрактна фабрика
public class Main {
    public static final double PLASTIC_PRICE_PER_SQUARE_METER = 300;
    public static final double FILM_PRICE_PER_SQUARE_METER = 150;
    public static final double PAINTED_PRICE_PER_SQUARE_METER = 500;
    public static void main(String[] args) {
        FacadeFactory filmFacadeFactory = new FilmFacadeFactory();
        FacadeFactory paintedFacadeFactory = new PaintedFacadeFactory();

        Order filmOrder = new Order("film facade");
        filmOrder.addFacade(filmFacadeFactory.createSolidFacade(10, FILM_PRICE_PER_SQUARE_METER));
        filmOrder.addFacade(filmFacadeFactory.createShowcaseFacade(5, FILM_PRICE_PER_SQUARE_METER));

        Order paintedOrder = new Order("painted facade");
        paintedOrder.addFacade(paintedFacadeFactory.createSolidFacade(8, PAINTED_PRICE_PER_SQUARE_METER));
        paintedOrder.addFacade(paintedFacadeFactory.createShowcaseFacade(6, PAINTED_PRICE_PER_SQUARE_METER));

        Order plasticOrder = new Order("plastic facade");
        plasticOrder.addFacade(filmFacadeFactory.createSolidFacade(10, PLASTIC_PRICE_PER_SQUARE_METER));
        plasticOrder.addFacade(filmFacadeFactory.createShowcaseFacade(5, PLASTIC_PRICE_PER_SQUARE_METER));

        filmOrder.printOrderDetails();
        System.out.println("Total Cost: " + filmOrder.calculateTotalCost());


        paintedOrder.printOrderDetails();
        System.out.println("Total Cost: " + paintedOrder.calculateTotalCost());

        plasticOrder.printOrderDetails();
        System.out.println("Total Cost: " + plasticOrder.calculateTotalCost());
    }
}

