// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code
		int currentMoney = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);

		double futereValue = currentMoney * Math.pow((1 + rate/100),n) ;
		
		System.out.println("After "+n+" years, a $"+currentMoney+" saved at "+(double)rate+"% will yield $"+(int)futereValue);
	}
}