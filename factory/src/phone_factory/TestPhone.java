package phone_factory;

import phone.Phone;

public class TestPhone {

	public static void main(String[] args) {
		Phone miPhone = PhoneFactory.createPhone("MiPhone");
		miPhone.makePhoneCall();
		miPhone.takePhoto();
		
		Phone iPhone = PhoneFactory.createPhone("iPhone");
		iPhone.takePhoto();
		iPhone.sendMessage();
		
		
	}

}
