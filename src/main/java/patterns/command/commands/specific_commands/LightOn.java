package patterns.command.commands.specific_commands;

import patterns.command.commands.Command;
import patterns.command.receiver.Light;

public class LightOn implements Command {
    private Light light;

    public LightOn(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
