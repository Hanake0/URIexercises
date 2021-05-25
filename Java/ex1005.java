import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		float b = in.nextFloat();
		in.close();

		System.out.printf("MEDIA = %.5f\n", ( ((a*3.5f) + (b*7.5f))/11f ));
	}
}
