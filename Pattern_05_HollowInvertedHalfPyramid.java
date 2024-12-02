/*
Hollow Inverted Half Pyramid
* * * * * *
*       *
*     *
*   *
* *
*

*/

import java.util.*;
public class Pattern_05_HollowInvertedHalfPyramid {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows ");
		int rows = scn.nextInt();

		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i==1 || j==1 ||i+j==rows+1) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}