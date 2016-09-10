
/*Horner's Rule
	 * Convert numbers from base b to decimal
	 * N = a(n)b^n + a(n-1)b^(n-1) + ... + a(1)b + a(0)
	 * N = (...((a(n)b + a(n-1))b + a(n-2))b + ... + a(1))b + a(0)
	 */
	 
public class HornersRule {

	public static void main(String[] args) {

		// Test: 1010101 in base 2
		int x = 1010101;
		
		System.out.println("This should print 85 " + HornersRuleBelow10(x, 2));
		System.out.println("This should print 10 " + HornersRuleBelow10(14,6));
	}
	
	/*
	 * Method gets a number and a base (2-9)
	 * Returns a decimal number 
	 */
	public static int HornersRuleBelow10 (int a, int b) {
		
		// If there are two digits
		if((a/10)/10 == 0) {
			return ((a / 10)*b  + a % 10);
		}
		
			/*
		 * Divide by 10 to get the rightmost digits
		 * Multiply by the base
		 * Add the leftmost digit
		 */
		
		return b * HornersRuleBelow10 (a/10, b) + (a % 10) ;
		
	}
}
