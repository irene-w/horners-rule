
public class HornersRule {

	public static void main(String[] args) {
		
		
		// Test: 1010101 in base 2
		
		int x = 1010101;
		
		System.out.println("This should print 85 " + HornersRuleBelow10(x, 2));
		System.out.println("This should print 10 " + HornersRuleBelow10(14,6));

	}
	
	/*Horner's Rule
	 * Convert numbers from base b to decimal
	 * N = a(n)b^n + a(n-1)b^(n-1) + ... + a(1)b + a(0)
	 * N = (...((a(n)b + a(n-1))b + a(n-2))b + ... + a(1))b + a(0)
	 */
	
	/*
	 * Method that flips the number
	 */
	public static int flip(int a) {
		int n =0;
		int counter = 0;
		
		// Determine the length of a
		int x = a;
		while (x>0) {
			x = x/10;
			counter++;
		}
		counter--; // decrease by one as the least significant decimal number 
		// corresponds to power of 0 base b
		
		System.out.println(counter);
		
		while(a > 0) {
			n += (a % 10)*Math.pow(10,counter);
			a=a/10;
			counter--;
			
		}
		return n;
	}
	
	
	/*
	 * Method gets an array of characters and a base
	 * Returns a decimal number 
	 * For bases 2 to 9
	 */
	public static int HornersRuleBelow10 (int a, int b) {
		/*
		 * Divide by 10 to get the rightmost digit
		 * Add it to the new number that's been shortened by one number
		 * Multiply it by the base
		 */
		
		// If there are two digits
		
		if((a/10)/10 == 0) {
			//System.out.println("This is a " + a);
			return ((a / 10)*b  + a % 10);
		}
		
		System.out.println("This is a " + a);
		
		return b * HornersRuleBelow10 (a/10, b) + (a % 10) ;
		
	}
}
