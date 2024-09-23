package Lab4.Lab4_1;

class ItemInBOX {
    private final String itemId;
    private final int quantity;
    private final double price;

    public ItemInBOX(String itemId, int quantity, double price) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // Метод для обчислення вартості товару
    public double getTotalPrice() {
        return quantity * price;
    }
}
