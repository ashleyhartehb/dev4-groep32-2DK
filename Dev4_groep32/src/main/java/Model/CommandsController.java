//code by Ashley Hart

package Model;

public class CommandsController {
    Command[] commands = new Command[1];
    Calculate calculate = new Calculate();

    int length = commands.length;




    public CommandsController(){
        this.commands = commands;
    }


    public Command[] addButtonWasPushed(double price) {
        Command addCommand = new AddCommand(calculate, price);
        addCommand.execute();
        if(commands == null){
            commands = new Command[1];
            commands[0] = addCommand;
        }else{
            commands = new Command[length];
            commands[length-1] = addCommand;
        }
        return commands;
    }

    public Command[] subtractButtonWasPushed(double price) {
        Command subtractCommand = new SubtractCommand(calculate, price);
        subtractCommand.execute();
        if(commands == null){
            commands = new Command[1];
            commands[0] = subtractCommand;

        }else{
            commands = new Command[length];
            commands[length-1] = subtractCommand;
        }
        return commands;
    }

    public Command[] undoButtonWasPushed() {
        if (commands != null) {
            System.out.println("Changing your mind? No problem !");
            commands[length -1].undo();
        }else{
            System.out.println("There are no commands in this list!");
        }
        return commands;
    }
}
