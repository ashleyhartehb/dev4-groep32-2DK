package command;

import org.junit.Test;

public class CommandTest {
    @Test
    void testCalculator(){
        Calculate calculate = new Calculate();
        Command addCommand = new AddCommand(calculate);
        Command subtractCommand = new SubtractCommand(calculate);
        //Command commandHistory = new CommandHistory(calculate);
    }
}
