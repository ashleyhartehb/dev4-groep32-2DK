import Model.*;
import org.junit.jupiter.api.Test;

public class CommandTest {
    @Test
    void testCalculator(){
        //Food food = new TypeofFood();
        //double price = food.Price();
        CommandsController controller = new CommandsController();


        controller.addButtonWasPushed(10.50);
        controller.undoButtonWasPushed();
        controller.addButtonWasPushed(25.45);
        controller.addButtonWasPushed(6.00);
        controller.subtractButtonWasPushed(3.00);
        controller.undoButtonWasPushed();

    }
}
