package Lab4.Lab4_1;

class RegularPricing implements Pricing {
    @Override
    public double getItemPrice(String itemId) {
        return switch (itemId) {
            case "item1" -> 10;
            case "item2" -> 20;
            case "item3" -> 30;
            case "item4" -> 40;
            case "item5" -> 50;
            default -> 0;
        };
    }

    @Override
    public double getDeliveryCost() {
        return 5;
    }
}
