import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int positives = 0;
		for(int i = 0; i<=6 ; i++) {
			float num = in.hasNextFloat() ? in.nextFloat() : -1;
			if (num == Math.abs(num))
				positives++;
		}
		in.close();

		System.out.printf("%d valores positivos\n", positives);
	}
}
