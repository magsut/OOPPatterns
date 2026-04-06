package complex.command;

public class Button {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void press() {
        if (command == null) {
            System.out.println("Кнопке не назначена никакая команда.");
            return;
        }

        command.execute();
    }
}