// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	
		int seed = Integer.parseInt(args[0]);
		boolean firstTime = true; 
		String verboes = args[1];
		boolean isVerboes = false;
		if (verboes.equals("v")) {
			isVerboes = true;
		}
			
		for (int i = 1; i <= seed; i++) { //rows - seed times 
			int result = i;
			if (isVerboes) {
				System.out.print(i + " ");
			}
			int steps = 0;
			while (result != 1 || firstTime) {
				firstTime = false;
				if (result % 2 == 0) {
					result = result / 2; 
				} else {
					result = result * 3 + 1;	
				}
				if (isVerboes) {
					System.out.print(result + " ");
				}
				steps++;
			} 
			if (isVerboes) {
				System.out.println("(" + (steps+1) + ")");
			}
			
		} 
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
