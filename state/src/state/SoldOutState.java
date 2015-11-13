package state;

public class SoldOutState implements State {

	private CandyMachine candyMachine;
	public  SoldOutState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("Sorry, candy is sold out. here is your coin.");
	}

	@Override
	public void returnCoin() {
		System.out.println("Sorry, but there is no coin.");

	}

	@Override
	public void turnCrank() {
		System.out.println("Sorry, but there is no candy.");
	}

	@Override
	public void dispense() {
		System.out.println("Sorry, but there is no candy.");
	}

}
