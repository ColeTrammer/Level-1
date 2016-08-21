
public class Driver {

	public static void main(String[] args) {
		Robot a = new Robot(true, "zero", 0.888);
		Robot b = new Robot(true, "one", 0.777);
		Robot c = new Robot(false, "realEvil", 0.001);

		a.destroyHumans();
		b.destroyHumans();
		c.destroyHumans();
	}

}
