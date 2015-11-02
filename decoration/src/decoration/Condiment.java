/**
 * 
 */
package decoration;

/**
 * @author Ethan-Wu
 * 作为装饰Beverage的原料(Condiment),覆盖了了原有的Beverage，并添加了新的特性。
 */
public abstract class Condiment extends Beverage {
	
	public Beverage wrappedBeverage;
	
	public Condiment (Beverage beverage){
		this.wrappedBeverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return wrappedBeverage.cost() + 0.5;
	}

	public abstract String getDescription();
}
