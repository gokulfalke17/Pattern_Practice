/*
Hollow Full Pyramid
     *
    * *
   *   *
  *     *
 *       *
* * * * * * 
 
*/

import java.util.*;
public class Pattern_08_HollowFullPyramid {
	
	public static void main(String[] args) {
        
        for (int i=1;i<=6;i++) {
            for (int j=1;j<=2*6-1;j++) {
                if (j<=6-i) {
                    System.out.printf(" ");
                } else if(j==6-i+1 || j==6+i-1 || i==6) {
                    System.out.printf("*");
                } else if (j>=6-i && j<=6+i-1) {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}