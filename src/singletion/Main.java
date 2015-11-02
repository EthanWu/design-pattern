package singletion;

public class Main {

	public static void main(String[] args) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		ChocolateBoiler filler = ChocolateBoiler.getInstance();
		boiler.fill();
		filler.boil();
		System.out.println(boiler.isBoiled());
		System.out.println(boiler.isEmpty());
	}
}
