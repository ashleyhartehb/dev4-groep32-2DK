package Model;

//receiver
public class Calculate {
    private double total;
    public double add(double price){
        System.out.println("You just added something to your chart !");
        total += price;
        System.out.println("Total is now: €" + total);
        return total;

    }
    public double subtract(double price){
        System.out.println("You just subtracted something from your chart !");
        total -= price;
        System.out.println("Total is now: €" + total);
        return total;
    }
}