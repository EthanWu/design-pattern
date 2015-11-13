package state;

public class SoldState implements State{

	private CandyMachine candyMachine;
	public  SoldState(CandyMachine candyMachine) {
		this.candyMachine = candyMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("You have inserted a coin.");
	}

	@Override
	public void returnCoin() {
		System.out.println("A coin rolling out.");
	}

	@Override
	public void turnCrank() {
		System.out.println("You don't need to do this.");
	}

	@Override
	public void dispense() {
		System.out.println("A candy rolling out.");
		candyMachine.setCandyCount(candyMachine.getCandyCount() - 1);
		if(candyMachine.getCandyCount() > 0){
			candyMachine.setNoCoinState(candyMachine.getNoCoinState());
		} else {
			candyMachine.setSoldOutState(candyMachine.getSoldOutState());
		}
	}

}
