//Code by Michalis Van Steen
package Model;

public class Meat extends ToppingSelection {
    String Chose;
    public Meat(Food food) {
        super(food);

        int min = 0;
        int max = 2;

        int MeatType = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("MeatType: " + MeatType);

        switch(MeatType) {
            case 0:
                super.setDescription(", Chicken ");
                Chose = "Chicken";
                break;
            case 1:
                super.setDescription(", Mix ");
                Chose = "Mix";
                break;
            case 2:
                super.setDescription(", Falafel ");
                Chose = "Falafel";
                break;
            default:
                super.setDescription(", No Meat ");
        }
    }
    @Override
    public double Price() {
        double AddedPrice = 0;
        switch(Chose) {
            case "Chicken":
                AddedPrice = 2.35;
                break;
            case "Mix":
                AddedPrice = 1.80;
                break;
            case "Falafel":
                AddedPrice = 1.45;
                break;
            default:
                super.setDescription(", No Meat ");
        }
        return super.Price() + AddedPrice;
    }

    public String getDescription() { return super.food.getDescription() + super.getDescription(); }
}
