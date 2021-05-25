import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        in.close();
        
        DecimalFormat format = new DecimalFormat("#.#####");
        format.setMinimumFractionDigits(5);
        
        System.out.println("MEDIA = " + format.format(((a*3.5f) + (b*7.5f))/11f));
    }
 
}