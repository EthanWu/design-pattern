package state;

public class CandyMachine {
	private State state;
	private State hasCoinState = new HasCoinState(this);
	private State noCoinState = new NoCoinState(this);
	private State soldState = new SoldState(this);
	private State soldOutState = new SoldOutState(this);
	private int candyCount = 0;
	
	public CandyMachine(int count){
		this.setCandyCount(count);
		this.state = noCoinState;
	}
	
	public void insertCoin(){
		this.state.insertCoin();
	}
	
	public void returnCoin(){
		this.state.returnCoin();
	}
	
	public void turnCrank(){
		this.state.turnCrank();
		if(this.state == this.soldState){
			this.state.dispense();
		}
	}
	
	public void refill (int count){
		this.candyCount += count;
		if(count > 0){
			this.state = this.noCoinState;
		}
	}
	
	public State getHasCoinState() {
		return hasCoinState;
	}

	public void setHasCoinState(State hasCoinState) {
		this.state = hasCoinState;
	}

	public State getNoCoinState() {
		return noCoinState;
	}

	public void setNoCoinState(State noCoinState) {
		this.state = noCoinState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.state = soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.state = soldOutState;
	}

	public int getCandyCount() {
		return candyCount;
	}

	public void setCandyCount(int candyCount) {
		this.candyCount = candyCount;
	}
	
}
