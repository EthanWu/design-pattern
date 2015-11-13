package state;

public class NoCoinState implements State {
	private CandyMachine candyMachine;

	public NoCoinState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("You inserted a coin.");
		candyMachine.setHasCoinState(candyMachine.getHasCoinState());
	}

	@Override
	public void returnCoin() {
		System.out.println("Your haven't insert any coin.");
		
	}

	@Override
	public void turnCrank() {
		System.out.println("Please insert a coin before your turn crank.");

	}

	@Override
	public void dispense() {
		System.out.println("Please insert a coin before your turn crank.");
	}

}
