// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 

		int terms = Integer.parseInt(args[0]);
		double pi = 0.0;

		for (int i = 0; i < terms; i++) {
			if (i % 2 == 0){
				pi += 1.0 / (i * 2 + 1);
			} else {
				pi -= 1.0 / (i * 2 + 1); 
			}
		}

		pi *= 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + pi);
	}
}
