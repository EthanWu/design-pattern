package command;

import things.Door;

public class DoorOpenCommand implements Command {
	Door door;
	
	public DoorOpenCommand(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.setStatus("open");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		door.setStatus("closed");
	}

}
