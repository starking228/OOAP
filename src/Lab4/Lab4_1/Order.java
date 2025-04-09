package Lab4.Lab4_1;

abstract class Order {
    protected Pricing pricing;

    protected Order(Pricing pricing) {
        this.pricing = pricing;
    }

    abstract void addItem(String itemId, int quantity);
    abstract double getTotalPrice();
}
