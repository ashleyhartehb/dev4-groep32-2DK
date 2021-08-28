//code by Ashley Hart

package Model;

//receiver
public class Calculate {
    private double total;
    public double add(double price){
        total += price;
        System.out.println("You just added €"+ price +"! Total is now: €" + total);
        return total;

    }
    public double subtract(double price){
        total -= price;
        System.out.println("You just subtracted €"+ price +"! Total is now: €" + total);
        return total;
    }
}