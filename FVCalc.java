// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int sum = Integer.parseInt(args[0]);
		double interest = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double rate = interest/100;
		double FV = sum * Math.pow((1+ rate), years);
		System.out.println("After " + years + " years, $" + sum +
		" saved at " + interest + "% will yield $" + (int)FV);



	}
}