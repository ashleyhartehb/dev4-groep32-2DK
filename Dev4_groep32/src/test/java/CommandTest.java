import Model.*;
import org.junit.jupiter.api.Test;

public class CommandTest {
    @Test
    void testCalculator(){
        //Food food = new TypeofFood();
        //double price = food.Price();
        CommandsController controller = new CommandsController();

        double price = 10.50;

        controller.addButtonWasPushed(price);
        controller.undoButtonWasPushed();
        controller.addButtonWasPushed(price);
        controller.subtractButtonWasPushed(price);
        controller.undoButtonWasPushed();

    }
}
