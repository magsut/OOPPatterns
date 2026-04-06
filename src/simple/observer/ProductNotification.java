package simple.observer;

import java.util.ArrayList;
import java.util.List;

public class ProductNotification implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final String productName;
    private String message;

    public ProductNotification(String productName) {
        this.productName = productName;
    }

    @Override
    public void addObserver(Observer observer) {
        System.out.println("Пользователь " + observer.getName() + " подписался(-лась) на товар " + productName);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Пользователь " + observer.getName() + " отписался(-лась) от товара " + productName);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.notify("Товар \"" + productName + "\": " + message);
        }
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}