package phone;

public class iPhone implements Phone {

	@Override
	public void makePhoneCall() {
		System.out.println("Called by iPhone");
	}

	@Override
	public void takePhoto() {
		System.out.println("The photo is taken by iPhone.");
	}

	@Override
	public void sendMessage() {
		System.out.println("The message is sent by iPhone");
	}

}
