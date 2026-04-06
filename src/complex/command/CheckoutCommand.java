package complex.command;

public class CheckoutCommand implements Command {
    private final StoreService storeService;

    public CheckoutCommand(StoreService storeService) {
        this.storeService = storeService;
    }

    @Override
    public void execute() {
        storeService.checkout();
    }
}