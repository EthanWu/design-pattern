package decoration;

public class Milk extends Condiment {

	public Milk(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.wrappedBeverage.getDescription() + ", with milk";
	}
	
	public double cost(){
		return this.wrappedBeverage.cost() + 0.5;
	}

}
