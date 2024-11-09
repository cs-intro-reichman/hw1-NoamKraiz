// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code
		int num = Integer.parseInt(args[0]);
		int hundreds, tens, units;
		if (num < 10){
			hundreds = 0;
			tens = 0;
			units = num;
		}
		else if (num < 100) {
			hundreds = 0;
			units = num%10;
			tens = num/10;
		}
		else{
			units = num%10;
			tens = (num/10)%10;
			hundreds = num/100;
		}

		System.out.println(hundreds+" hundreds, "+tens+" tens, and "+units+" ones.");
	}
}
