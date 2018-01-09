package patterns.command.invoker;

import patterns.command.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandsOn;
    private List<Command> commandsOff;
    private Command undoCommand;

    public RemoteControl() {
        commandsOn = new ArrayList<>();
        commandsOff = new ArrayList<>();
    }

    public void setCommand(int index, Command on, Command off) {
        commandsOn.add(index, on);
        commandsOff.add(index, off);
    }

    public void onButtonPushed(int index) {
        commandsOn.get(index).execute();
        undoCommand = commandsOn.get(index);
    }

    public void offButtonPushed(int index) {
        commandsOff.get(index).execute();
        undoCommand = commandsOff.get(index);
    }

    public void undoButtonPushed() {
        undoCommand.undo();
    }
}
