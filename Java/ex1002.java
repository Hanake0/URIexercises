import java.util.Scanner;

public class Main {
	static final double pi = 3.14159;

	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		in.close();

		System.out.printf("A=%.4f\n", pi*r*r);
	}
}
