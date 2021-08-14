package Model;

public class Sauce extends ToppingSelection {
    public Sauce(Food food) {
        super(food);

        int min = 0;
        int max = 2;

        int SauceType = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("SauceType: " + SauceType);

        switch(SauceType) {
            case 0:
                super.setDescription(", Mayonaise ");
                break;
            case 1:
                super.setDescription(", Ketchup ");
                break;
            case 2:
                super.setDescription(", Andalouse ");
                break;
            default:
                super.setDescription(", No Sauce ");
        }
    }
    @Override
    protected double Price() { return super.Price() + 0.70; }

    public String getDescription() { return super.food.getDescription() + super.getDescription(); }

}
