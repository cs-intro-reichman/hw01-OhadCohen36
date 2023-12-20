/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		double randomOne = (((max-min) * Math.random()) + min);
		double randomTwo = (((max-min) * Math.random()) + min);
		double randomThree = (((max-min) * Math.random()) + min);
		System.out.println((int)(randomOne));
		System.out.println((int)(randomTwo));
		System.out.println((int)(randomThree));
		System.out.println("The minimal generated number was: " + Math.round(Math.min(randomOne,Math.min(randomTwo,randomThree))));		
	}
}
