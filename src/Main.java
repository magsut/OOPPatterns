public class Main {
    public static void main(String[] args) {
        System.out.println("===== SIMPLE PATTERNS =====");
        simple.singleton.Demo.run();
        simple.factory.Demo.run();
        simple.strategy.Demo.run();
        simple.observer.Demo.run();

        System.out.println("\n===== COMPLEX PATTERNS =====");
        complex.decorator.Demo.run();
        complex.command.Demo.run();
        complex.state.Demo.run();
        complex.composite.Demo.run();
    }
}