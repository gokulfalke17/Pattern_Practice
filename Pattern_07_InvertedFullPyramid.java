/*
Inverted Full Pyramid
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
*/

import java.util.*;
public class Pattern_07_InvertedFullPyramid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows and Cols ");
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		
		for(int i=1;i<=rows;i++) {
			boolean flag=true;
			for(int j=1;j<=cols;j++) {
				if(j>=i && j<=cols-i+1 && flag) {
					System.out.printf("*");
					flag=false;
				}else {
					System.out.printf(" ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
