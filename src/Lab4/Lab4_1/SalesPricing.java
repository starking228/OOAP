package Lab4.Lab4_1;

class SalesPricing implements Pricing {
    @Override
    public double getItemPrice(String itemId) {
        return switch (itemId) {
            case "item1" -> 7;
            case "item2" -> 15;
            case "item3" -> 25;
            case "item4" -> 34;
            case "item5" -> 40;
            default -> 0;
        };
    }

    @Override
    public double getDeliveryCost() {
        return 2;
    }
}
