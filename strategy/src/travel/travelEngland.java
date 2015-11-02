package travel;

import behavior.ITravel;

public class travelEngland implements ITravel {

	@Override
	public void travel() {
		System.out.println("I am traveling to England...");
	}
}
