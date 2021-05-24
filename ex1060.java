import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner in = new Scanner(System.in);
        
        int positives = 0;
        for(int i = 0; i<=6 ; i++) {
            float num = -1;
            if(in.hasNextFloat())
                num = in.nextFloat();
            
            if (num == Math.abs(num))
               	positives++;
            
        }
        
        in.close();
        
        System.out.println(positives + " valores positivos");
    }
 
}