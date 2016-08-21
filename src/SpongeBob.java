
public class SpongeBob {

	/*
	 * 1. In a Runner class, make a SeaCreature called “Spongebob”. Use the methods below to make him eat, and laugh.
	 * 2. Make Patrick and Squidward and print their name, have them eat, and make them laugh.
	 */
	
	public static void main(String[] args) {
		
		SeaCreature sb = new SeaCreature("Spongebob");
		sb.eat();
		sb.laugh();
		
		SeaCreature pa = new SeaCreature("Patrick");
		SeaCreature sw = new SeaCreature("Squidward");
		
		System.out.println(pa.getName());
		System.out.println(sw.getName());
		
		pa.eat();
		sw.eat();
		
		pa.laugh();
		sw.laugh();
	}

}
