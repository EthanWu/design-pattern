package person;

import travel.travelChina;
import eat.eatChocolate;
import behavior.IEatBehavior;
import behavior.ITravel;

public class Person {
	private IEatBehavior eat;
	private ITravel travel;
	public Person(){
		eat = new eatChocolate();
		travel = new travelChina();
	}
	
	public void setEatBehavior(IEatBehavior eatBehavior){
		this.eat = eatBehavior;
	}
	
	public void setTravelBehavior(ITravel travelBehavior){
		this.travel = travelBehavior;
	}
	public void  eat() {
		eat.eating();
	}
	public void  travel() {
		travel.travel();
	}
}
