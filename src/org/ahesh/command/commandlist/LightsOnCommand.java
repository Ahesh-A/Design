package org.ahesh.command.commandlist;

import org.ahesh.command.Command;
import org.ahesh.command.commandObjects.Light;
public class LightsOnCommand implements Command {
    Light light;
    public LightsOnCommand(Light light) {
        this.light = light;
    }

    public void lightSetter(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
