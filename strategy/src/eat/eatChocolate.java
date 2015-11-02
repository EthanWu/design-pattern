package eat;

import behavior.IEatBehavior;

public class eatChocolate implements IEatBehavior {

	@Override
	public void eating() {
		System.out.println("I am eating chocolate!");
	}
}
