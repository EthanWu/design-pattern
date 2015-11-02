package decoration;

public class Whip extends Condiment {

	
	
	public Whip(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.wrappedBeverage.getDescription() + ", with whip";
	}
	
	public double cost(){
		return this.wrappedBeverage.cost() + 0.3;
	}

}
