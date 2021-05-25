import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		float a = in.nextFloat();
		float b = in.nextFloat();
		float c = in.nextFloat();
		in.close();

		System.out.printf("MEDIA = %.1f\n", ( ((a*2f) + (b*3f) + (c*5f))/10f ));
	}
}
