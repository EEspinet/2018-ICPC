/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package timelimits;

import java.util.*;

/**
 *
 * @author Enrique
 */
public class TimeLimits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numSolutions = 0;
        int factor = 0;
        
        Scanner in = new Scanner(System.in);
        numSolutions = in.nextInt();
        factor = in.nextInt();
        
        int max = 0;
        
        int solution = 0;
        for(int a = 0; a < numSolutions; a++)
        {
            solution = in.nextInt();
            if(solution > max)
            {
                max = solution;
            }
        }
        
        double total = max * factor;
        total = total / 1000;
        
        double finalValue = Math.ceil(total);
        int forRealFinalValue = (int)finalValue;
        
        System.out.println(forRealFinalValue);
    }
    
}
