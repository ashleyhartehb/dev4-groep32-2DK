package command;

//concrete command
public class AddCommand implements Command {
    Calculate calculate;

    public AddCommand(Calculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public void execute() {
        calculate.add();
    }

    public void undo() {
        calculate.subtract();
    }

}
