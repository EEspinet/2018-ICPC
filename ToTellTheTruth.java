/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package totellthetruth;

import java.util.*;

/**
 * 2018 ICPC Southeast USA Regional Contest
 */
public class ToTellTheTruth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int numPeople = in.nextInt();
        int[][] array1 = new int[numPeople][numPeople];
        
        for(int a = 0; a < numPeople;a++)
        {
            int initial = in.nextInt();
            int last = in.nextInt();
            
            for(int i = initial; i <= last;i++)
            {
                if(i == 0)
                {
                    
                }
                else
                {
                    array1[a][i-1] = 1;
                }
            }
        }
        boolean done = false;
        int count = 0;
        for(int k = numPeople - 1; k >= 0; k--)
        {
            count = 0;
            for(int j = 0; j < numPeople;j++)
            {
                if(array1[j][k] == 1)
                {
                    count++;
                }
            }
//            System.out.println(count);
            if(count == k + 1)
            {
                done = true;
                break;
            }
        }
        
        if(done)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("-1");
        }
    }
    
}
