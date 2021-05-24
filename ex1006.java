import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        in.close();
        
        DecimalFormat format = new DecimalFormat("#.#");
        format.setMinimumFractionDigits(1);
        
        System.out.println("MEDIA = " + format.format(((a*2f) + (b*3f) + (c*5f))/10f));
    }
 
}