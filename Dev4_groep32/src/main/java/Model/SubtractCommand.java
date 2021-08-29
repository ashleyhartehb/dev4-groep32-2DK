//code by Ashley Hart

package Model;

public class SubtractCommand implements Command {

    private Calculate calculate;
    Food food;
    private double price;    


    public SubtractCommand(Calculate calculate, double price) {

        this.calculate = calculate;
        this.price = price;
    }
    @Override
    public void execute() {
        calculate.subtract(price);
    }

    public void undo() {
        calculate.add(price);
    }

}

