package adapter;

public class Main {

	public static void main(String[] args) {
		Turkey turkey = new Turkey();
		DuckAdapter duckAdapter = new DuckAdapter(turkey);
		duckAdapter.fly();
		duckAdapter.quark();
	}

}
