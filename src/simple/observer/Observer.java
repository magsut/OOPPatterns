package simple.observer;

public interface Observer {
    void notify(String message);
    String getName();
}