import eat.eatPork;
import behavior.IEatBehavior;
import behavior.ITravel;
import person.Person;
import travel.travelEngland;


public class main {

	public static void main(String[] args) {
		Person ethan = new Person();
		ethan.eat();
		ethan.travel();
		IEatBehavior eatBehavior = new eatPork();
		ITravel travelBehavior = new travelEngland();
		ethan.setEatBehavior(eatBehavior);
		ethan.eat();
		ethan.setTravelBehavior(travelBehavior);
		ethan.travel();
	}
}
