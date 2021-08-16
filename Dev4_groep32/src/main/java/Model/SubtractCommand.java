package Model;

public class SubtractCommand implements Command {

    private Calculate calculate;
    Food food;
    private double price;     //= food.Price();


    public SubtractCommand(Calculate calculate, double price) {

        this.calculate = calculate;
        this.price = price;
    }
    @Override
    public void execute() {
        calculate.subtract(price);
        System.out.println("You just subtracted €"+ price);
    }

    public void undo() {
        calculate.add(price);
        System.out.println("You just added €"+ price);
    }

}

