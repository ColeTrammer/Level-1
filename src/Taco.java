
public class Taco {

	String type;
	int size;
	float spicyness;
	
	Taco(String tacoType) {
		size = 1;
		type = tacoType;
		spicyness = 0.1f;
	}
	
	void eat() {
		size = 0;
	}
	
	void add() {
		size += 1;
	}
	
	void addHotSauce() {
		spicyness += 0.5;
	}

	public static void main(String[] args) {
		
		Taco t = new Taco("chicken");
		t.eat();
		t.add();
		t.addHotSauce();
		
		Pizza p = new Pizza(0);
		p.addToppings("nothing");
		p.deliver();
		
		TheFlavors f = new TheFlavors(0);
		System.out.println(f.dravagazagaz());
		f.farnzol(0);
		System.out.println(f.flargleflargle('s'));
		
		StirFry sf = new StirFry("idk");
		sf.addTofu(0);
		sf.sell();
		
	}
	
}
