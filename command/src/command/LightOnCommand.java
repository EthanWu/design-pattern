package command;

import things.Light;

public class LightOnCommand implements Command {
	Light light;
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.setStatus("on");
	}

	@Override
	public void undo() {
		light.setStatus("off");
	}

}
