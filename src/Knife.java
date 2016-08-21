
public class Knife {

	private double sharpness;

	public Knife(double sharpPercent) {
		sharpness = sharpPercent;
	}

	public void stab(String thing, String stabbed) {
		System.out.println(thing + " stabbing " + stabbed + " with a knife of sharpness " + sharpness + "!");
	}

}
