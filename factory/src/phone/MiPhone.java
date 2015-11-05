package phone;

public class MiPhone implements Phone {
	
	@Override
	public void makePhoneCall() {
		// TODO Auto-generated method stub
		System.out.println("Called by MiPhone.");
	}

	@Override
	public void takePhoto() {
		System.out.println("Photoed by MiPhone.");
	}

	@Override
	public void sendMessage() {
		System.out.println("Message sent by MiPhone");
	}
}
