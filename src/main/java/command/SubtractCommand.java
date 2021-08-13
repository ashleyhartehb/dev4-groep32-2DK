package command;

//concrete command
public class SubtractCommand implements Command {

    private Calculate calculate;

    public SubtractCommand(Calculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public void execute() {
        calculate.subtract();
    }

    public void undo() {
        calculate.add();
    }

}
