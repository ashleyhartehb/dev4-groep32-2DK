//Code by Michalis Van Steen
//import org.junit.Test;
import Model.*;
import org.junit.jupiter.api.Test;


public class FoodTest {
    @Test
    void CreatePita() {
        Food food = new TypeofFood();
        food = new Vegetables(food);
        food = new Sauce(food);
        food = new Meat(food);
        System.out.println(((Meat) food).getDescription() + ", Total price is: $" + Math.round(((Meat) food).Price()* 100.0) / 100.0);
    }
}
