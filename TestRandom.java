// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {

		int N = Integer.parseInt(args[0]);

		double random = 0;
		int bigCounter = 0;
		int lessCounter = 0;
		
		for (int i = 0 ; i < N ; i++) {
			random = Math.random();
			if (random <= 0.5 ) {
				lessCounter++;
			} else {
				bigCounter++;
			}
		} 
		
		System.out.println("> 0.5: " + bigCounter + " times");
		System.out.println("<= 0.5: " + lessCounter + " times");
		
		if (lessCounter > 0) {
			System.out.println("Ratio: " + (double) bigCounter / lessCounter);
		}	
	}
}
