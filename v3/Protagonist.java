public abstract class Protagonist extends Character{
	private String name;

	public Protagonist( String input){
		name = input;
		health = 125;
		strength = 100;
		defense = 40;
		attack = 0.4;
	}
	
	public String getName(){
		return name;
	}

	public void specialize(){
		defense = defense / 2 -5;
		attack = attack * 2;
	}

	public void normalize() {
		defense = 40;
		attack = 0.4;
	}

	// Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
	public abstract String toString();

	
}
