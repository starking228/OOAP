package Lab4.Lab4_1;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart extends Order {
    private final List<ItemInBOX> items = new ArrayList<>();

    public ShoppingCart(Pricing pricing) {
        super(pricing);
    }

    @Override
    void addItem(String itemId, int quantity) {
        double price = pricing.getItemPrice(itemId);
        items.add(new ItemInBOX(itemId, quantity, price));
    }

    @Override
    double getTotalPrice() {
        double total = 0.0;
        for (ItemInBOX item : items) {
            total += item.getTotalPrice();
        }
        total += pricing.getDeliveryCost(); // Додаємо вартість доставки
        return total;
    }
}
