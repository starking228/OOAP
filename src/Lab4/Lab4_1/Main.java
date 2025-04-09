package Lab4.Lab4_1;

// Міст
public class Main {
    public static void main(String[] args) {

//        Pricing pricing = new SalesPricing();
        Pricing pricing = new RegularPricing();

        Order cart = new ShoppingCart(pricing);

        cart.addItem("item1", 2);
        cart.addItem("item2", 1);

        double totalPrice = cart.getTotalPrice();

        System.out.println("Total price of the order: " + totalPrice);
    }
}

