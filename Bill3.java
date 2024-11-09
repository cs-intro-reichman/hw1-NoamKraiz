// Splits a restaurant bill evenly among three diners.

public class Bill3 {
	public static void main(String[] args) {

		// To get you started, here is the first line in the program:
		String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int price = Integer.parseInt(args[3]);
		double dividdedPrice = price/3;
		double roundPrice = Math.ceil(dividdedPrice);
	    // System.out.println(" pay"+roundPrice+" Shekels each.");		
	    System.out.println("Dear "+name1+" "+name2+" "+name3+": pay"+roundPrice+" Shekels each.");		

	}
}