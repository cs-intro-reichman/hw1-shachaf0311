// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int num1 = (int)(Math.random() * limit);
		int num2 = (int)(Math.random() * limit);
		int num3 = (int)(Math.random() * limit);
		int s1 = Math.min(num1, Math.min(num2, num3));
		int s3 = Math.max(num1, Math.max(num2, num3));
		int s2 = num1 + num2 + num3 - s1 - s3;
		System.out.println(num1 + " " + num2 + " " + num3);
		System.out.println(s1 + " " + s2 + " " + s3);
	}
}
