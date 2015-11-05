package phone_factory;

import phone.MiPhone;
import phone.Phone;
import phone.iPhone;

public class PhoneFactory {
	Phone phone;
	public static Phone createPhone(String type){
		if (type == "MiPhone"){
			return new MiPhone();
		} else if (type == "iPhone"){
			return new iPhone();
		}
		return null;
	}
}
