package adapter;

public class DuckAdapter extends Duck {
	private Turkey turkey;
	public DuckAdapter(Turkey turkey){
		this.turkey =turkey;
	}
	public void fly () {
			turkey.fly();
	}
	public void quark (){
		turkey.glgoo();
	}
}
