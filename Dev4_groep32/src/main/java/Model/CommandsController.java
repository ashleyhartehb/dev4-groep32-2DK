package Model;

public class CommandsController {
    Command[] commands = new Command[0];
    Calculate calculate = new Calculate();

    int length = commands.length;




    public CommandsController(){
        this.commands = commands;
    }


    public Command[] addButtonWasPushed(double price) {
        Command addCommand = new AddCommand(calculate, price);
        addCommand.execute();
        if(commands == null){
            commands = new Command[0];
            commands[0] = addCommand;
            System.out.println("You just added something to the commands");
        }else{
            commands = new Command[length];
            commands[length] = addCommand;
            System.out.println("Commands wasn't empty");
        }
        return commands;
    }

    public Command[] subtractButtonWasPushed(double price) {
        Command subtractCommand = new SubtractCommand(calculate, price);
        subtractCommand.execute();
        if(commands == null){
            commands = new Command[0];
            commands[0] = subtractCommand;

        }else{
            commands = new Command[length];
            commands[length] = subtractCommand;
        }
        return commands;
    }

    public Command[] undoButtonWasPushed() {
        if (commands != null) {
            commands[length - 1].undo();
        }else{
            System.out.println("There are no commands in this list!");
        }
        return commands;
    }
}
