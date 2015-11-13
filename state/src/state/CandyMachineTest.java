package state;

public class CandyMachineTest {

	public static void main(String[] args) {
		CandyMachine candyMachine = new CandyMachine(1);
		candyMachine.insertCoin();
		candyMachine.turnCrank();
		
		candyMachine.turnCrank();
		
		candyMachine.refill(2);
		
		candyMachine.insertCoin();
		candyMachine.insertCoin();
		candyMachine.turnCrank();
		candyMachine.turnCrank();
		
		candyMachine.returnCoin();
		candyMachine.insertCoin();
		candyMachine.turnCrank();
		
		candyMachine.insertCoin();
		candyMachine.turnCrank();
	}

}
