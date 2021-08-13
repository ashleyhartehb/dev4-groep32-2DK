package command;

//receiver
public class Calculate {
private double price;
private double total = 0;
    public void add(){
        System.out.println("You just added something to the list !");
        total += price;
    }
    public void subtract(){
        System.out.println("You just subtracted something from the list !");
        total-=price;
    }
}
