
public class Robot {

	private Knife knife;
	private String name;
	private boolean isEvil;

	public Robot(boolean evil, String n, double sharpness) {
		knife = new Knife(sharpness);
		name = (n.charAt(0) + "").toUpperCase() + n.substring(1);
		isEvil = evil;
	}

	public void destroyHumans() {
		if (isEvil) {
			System.out.print(name + " has just terminated the human race by");
			knife.stab("", "humans");
		}
		else
			System.out.println(name + " is a traitor and loves humans.");
	}

}
