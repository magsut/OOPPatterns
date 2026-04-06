package complex.command;

public class RemoveFromCartCommand implements Command {
    private final StoreService storeService;
    private final String item;

    public RemoveFromCartCommand(StoreService storeService, String item) {
        this.storeService = storeService;
        this.item = item;
    }

    @Override
    public void execute() {
        storeService.removeFromCart(item);
    }
}