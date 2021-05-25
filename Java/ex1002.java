import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
 
        double pi = 3.14159;
        
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        in.close();
        
        System.out.printf("A=%.4f/n", pi*r*r);
    }
 
}