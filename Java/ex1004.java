import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();

		System.out.printf("PROD = %d\n", (a * b));
	}
}
