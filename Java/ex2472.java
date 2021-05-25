import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		final String[] input = in.nextLine().split(" ");
		in.close();
		
		final long comp = Integer.parseInt(input[0]);
		final long quant = Integer.parseInt(input[1]);
		
		final long area = (comp-(quant-1))*(comp-(quant-1)) + (quant-1);

		System.out.printf("%d\n", area);
	}
}
