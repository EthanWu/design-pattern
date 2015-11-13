package state;

public class HasCoinState implements State {
	private CandyMachine candyMachine;
	public HasCoinState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}

	@Override
	public void insertCoin() {
		System.out.println("You have inserted a coin. That is enough.");
	}

	@Override
	public void returnCoin() {
		System.out.println("A coin rolling out.");		
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned the crank.");
		candyMachine.setSoldState(candyMachine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("You can not do this.");
	}

}
