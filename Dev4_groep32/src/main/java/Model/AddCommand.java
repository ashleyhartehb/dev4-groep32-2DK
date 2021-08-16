package Model;

//concrete command
public class AddCommand implements Command {

    private Calculate calculate;
    Food food;
    private double price;     //= food.Price();

    public AddCommand(Calculate calculate, double price) {

        this.calculate = calculate;
        this.price = price;
    }

    @Override
    public void execute() {
        calculate.add(price);
        System.out.println("You just added €"+ price);
    }

    public void undo() {
        calculate.subtract(price);
        System.out.println("You just subtracted €"+ price);

    }

}