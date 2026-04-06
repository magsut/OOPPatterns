package simple.observer;

public class Customer implements Observer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println("Пользователь " + name + " получил уведомление: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}