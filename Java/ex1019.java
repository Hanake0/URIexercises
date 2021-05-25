import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		in.close();
		
		final int segundos = input%60;
		final int minutos = (input/=60)%60;
		final int horas = (input/=60);
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
	}
}
