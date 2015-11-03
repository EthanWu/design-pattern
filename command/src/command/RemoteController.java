package command;

public class RemoteController {
	Command command;

	public RemoteController(Command command) {
		this.command = command;
	}
	
	public void buttonPressed(){
		this.command.execute();
	}
	public void buttonUnpressed(){
		this.command.undo();
	}
	
}
