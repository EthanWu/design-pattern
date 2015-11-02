/**
 * 
 */
package decoration;

/**
 * @author Ethan-Wu
 *
 */
public abstract class Beverage {
	protected String description = "Beverage base.";
	public String getDescription(){
		return this.description;
	};
	public abstract double cost();
}
