package complex.decorator;

public class BasicOrder implements OrderComponent {
    private final String productName;
    private final double baseCost;

    public BasicOrder(String productName, double baseCost) {
        this.productName = productName;
        this.baseCost = baseCost;
    }

    @Override
    public String getDescription() {
        return "Order: " + productName;
    }

    @Override
    public double getCost() {
        return baseCost;
    }
}