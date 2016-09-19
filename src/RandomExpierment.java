import java.util.Random;

public class RandomExpierment {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int count = 0;
		int random = r.nextInt(100);
		
		for (int i = 0; i < 1000000; i++) {
			
			if (random == r.nextInt(100))
				count++;
			
		}
		
		System.out.println(count);
		
		int count2 = 0;
		
		for (int i = 0; i < 1000000; i++) {
			
			if (r.nextInt(100) == r.nextInt(100))
				count2++;
			
		}
		
		System.out.println(count2);
		
	}
	
}
