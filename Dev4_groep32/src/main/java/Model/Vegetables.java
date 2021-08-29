//Code by Michalis Van Steen
package Model;

public class Vegetables extends ToppingSelection {
    String Chose;
    public Vegetables(Food food) {
        super(food);
        int min = 0;
        int max = 1;

        int Vegetables = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("Vegetables: " + Vegetables);

        switch(Vegetables) {
            case 0:
                super.setDescription(", Vegetables ");
                Chose = "yes";
                break;
            case 1:
                super.setDescription(", No Vegetables ");
                Chose = "no";
                break;
            default:
                super.setDescription(", Vegetables ");
        }
    }

    @Override
    protected double Price() {
        Double AddedPrice;
        if (Chose == "yes"){
            AddedPrice = 0.35;
        }
        else {
            AddedPrice = 0.00;
        }


        return super.Price() + AddedPrice; }

    public String getDescription() { return super.food.getDescription() + super.getDescription(); }
}
