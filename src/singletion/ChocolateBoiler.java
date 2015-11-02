package singletion;


public class ChocolateBoiler {
	private static ChocolateBoiler instance;
	private boolean boiled;
	private boolean empty;
	private ChocolateBoiler(){
		boiled = false;
		empty =true;
	}
	//提供静态的getInstance获取单个实例，如果不存在则创建，存在则直接返回。
	public static ChocolateBoiler getInstance(){
		if(instance == null){
			instance = new ChocolateBoiler();
		}
		return instance;
	}
	
	public boolean isEmpty(){
		return empty;
	}
	public boolean isBoiled(){
		return this.boiled;
	}
	
	public void fill(){
		instance.empty = false;
	}
	
	public void boil(){
		instance.boiled = true;
	}
}
