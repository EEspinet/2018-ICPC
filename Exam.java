/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package exam;

import java.util.*;

/**
 *2018 ICPC Southeast USA Regional Contest
 */
public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCorrect = in.nextInt();
        
        String first = in.next();
        char[] array1 = first.toCharArray();
        
        String second = in.next();
        char[] array2 = second.toCharArray();
        
        int numSame = 0;
        
        for(int a = 0; a < array1.length;a++)
        {
            if(array1[a] == array2[a])
            {
                numSame++;
            }
        }
        
        int total = 0;
        if(numSame <= numCorrect)
        {
            total = numSame + (array1.length - numCorrect);
        }
        else
        {
            total = (numSame - (numSame - numCorrect)) + (array1.length - numSame);
        }
        
        System.out.println(total);
    }
    
}
