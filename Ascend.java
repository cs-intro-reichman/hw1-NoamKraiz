// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code
		int lime = Integer.parseInt(args[0]);
		int a = (int)(lime*Math.random());
		int b = (int)(lime*Math.random());
		int c = (int)(lime*Math.random());

		int max, min, middle;

		max = Math.max(a, b);
		max = Math.max(max, c);
		middle = Math.min(a, b);
		min = Math.min(middle, c);
		middle = Math.max(middle, min);

		System.out.println(min+" "+middle+" "+max);

	}
}
