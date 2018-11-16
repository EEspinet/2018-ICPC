/*
 * Created by:
 * Enrique F. Espinet
 * Copyright @2018
 */
package goatrope;

import java.text.DecimalFormat;
import java.util.*;

/**
 *2018 ICPC Southeast USA Regional Contest
 */
public class GoatRope {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x,y,x1,y1,x2,y2 = 0;
        
        x = in.nextInt();
        y = in.nextInt();
        x1 = in.nextInt();
        y1 = in.nextInt();
        x2 = in.nextInt();
        y2 = in.nextInt();
        
        double side1= 0;
        double side2 = 0;
        double output = 0;
        
        if(x < x1)
        {
            side1 = x1 - x;
            if(y < y1)
            {
                side2 = y1 - y;
                output = Math.sqrt((side1 * side1) + (side2 * side2));
            }
            else if(y > y2)
            {
                side2 = y - y2;
                output = Math.sqrt((side1 * side1) + (side2 * side2));
            }
            else
            {
                side2 = 1;
                output = side1 * side2;
            }
        }
        else if(x > x2)
        {
            side1 = x - x2;
            if(y < y1)
            {
                side2 = y1 - y;
                output = Math.sqrt((side1 * side1) + (side2 * side2));
            }
            else if(y > y2)
            {
                side2 = y - y2;
                output = Math.sqrt((side1 * side1) + (side2 * side2));
            }
            else
            {
                side2 = 1;
                output = side1 * side2;
            }
        }
        else
        {
            side1 = 1;
            if(y < y1)
            {
                side2 = y1 - y;
            }
            else if(y > y2)
            {
                side2 = y - y2;
            }
            output = side1 * side2;
        }
        
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println(df.format(output));
    }
    
}
