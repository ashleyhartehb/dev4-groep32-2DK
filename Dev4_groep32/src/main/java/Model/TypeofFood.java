//Code by Michalis Van Steen
package Model;

public class TypeofFood extends Model.Food {
    String Food;
    public TypeofFood() {

        int min = 0;
        int max = 2;

        int Foodtype = (int)Math.floor(Math.random()*(max-min+1)+min);

        System.out.println("Foodtype: " + Foodtype);

            switch(Foodtype) {
                case 0:
                    setDescription("Durum has been selected");
                    Food = "Durum";
                    break;
                case 1:
                    setDescription("Pita has been selected");
                    Food = "Pita";
                    break;
                case 2:
                    setDescription("Kapsalon has been selected");
                    Food = "Kapsalon";
                    break;
                default:
                    setDescription("No food has been selected");

        }
     }

    @Override
    protected double Price() {
        Double price = 0.00;

        if (Food == "Durum"){
            price = 2.95;
        }
        else if (Food == "Pita"){
            price = 3.50;
        }
        else if (Food == "Kapsalon"){
            price = 4.50;
        }

        return price;

    }
}
