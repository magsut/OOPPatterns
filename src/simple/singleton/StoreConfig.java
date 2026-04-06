package simple.singleton;

public class StoreConfig {
    private static StoreConfig instance;

    private String storeName;
    private String currency;
    private double taxRate;

    private StoreConfig() {
        this.storeName = "My Online Store";
        this.currency = "RUB";
        this.taxRate = 0.15;
    }

    public static StoreConfig getInstance() {
        if (instance == null) {
            instance = new StoreConfig();
        }
        return instance;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void printConfig() {
        System.out.println("Store name: " + storeName);
        System.out.println("Currency: " + currency);
        System.out.println("Tax rate: " + taxRate);
    }
}