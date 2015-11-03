import command.Command;
import command.DoorOpenCommand;
import command.LightOnCommand;
import command.RemoteController;
import things.Door;
import things.Light;


public class Main {

	public static void main(String[] args) {
		Light light = new Light();
		Door door = new Door();
		Command lightCommand = new LightOnCommand(light); 
		Command doorCommand = new DoorOpenCommand(door);
		
		System.out.println(light.getStatus());
		RemoteController controller = new RemoteController(lightCommand);
		controller.buttonPressed();
		System.out.println(light.getStatus());
		controller.buttonUnpressed();
		System.out.println(light.getStatus());
		
		System.out.println(door.getStatus());
		controller = new RemoteController(doorCommand);
		controller.buttonPressed();
		System.out.println(door.getStatus());
		controller.buttonUnpressed();
		System.out.println(door.getStatus());
	}

}
