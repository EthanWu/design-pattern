package decoration;

public class Main {

	public static void main(String[] args) {
		Latte latte = new Latte();
		System.out.println(latte.getDescription() + ". cost " + latte.cost());
		Condiment latteWithWhip = new Whip(latte);
		System.out.println(latteWithWhip.getDescription() + ". cost " + latteWithWhip.cost());
		Condiment latteWithDoubleWhip = new Whip(latteWithWhip);
		System.out.println(latteWithDoubleWhip.getDescription() + ". cost " + latteWithDoubleWhip.cost());
		Condiment latteWithDoubleWhipAndMilk = new Milk(latteWithDoubleWhip);
		System.out.println(latteWithDoubleWhipAndMilk.getDescription() + ". cost " + latteWithDoubleWhipAndMilk.cost());
	}	
}
