
package epfc;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random r1 = new Random(3);
        for (int j=0; j<2; j++){
            for (int i=0; i<10; i++){
            System.out.print(r1.nextInt(1000) + " ");
 
        }
        
            System.out.print(" ");
        
    }
}
}
    
