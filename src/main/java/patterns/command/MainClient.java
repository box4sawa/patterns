package patterns.command;

import patterns.command.commands.Command;
import patterns.command.commands.specific_commands.LightOff;
import patterns.command.commands.specific_commands.LightOn;
import patterns.command.invoker.RemoteControl;
import patterns.command.receiver.Light;

public class MainClient {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Command lightOn = new LightOn(light);
        Command lightOff = new LightOff(light);

        remoteControl.setCommand(0, lightOn, lightOff);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);
        remoteControl.undoButtonPushed();
    }
}
