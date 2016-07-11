package prob7;

public abstract class Bird {
	String name;
	int leg = 2;
	
	public int getLeg() {
		return leg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void fly();
	public abstract void sing();
}
