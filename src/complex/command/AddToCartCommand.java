package complex.command;

public class AddToCartCommand implements Command {
    private final StoreService storeService;
    private final String item;

    public AddToCartCommand(StoreService storeService, String item) {
        this.storeService = storeService;
        this.item = item;
    }

    @Override
    public void execute() {
        storeService.addToCart(item);
    }
}