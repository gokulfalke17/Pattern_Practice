/*
Half Pyramid
*
* *
* * *
* * * *
* * * * *
* * * * * *

*/

import java.util.*;
public class Pattern_03_HalfPyramid {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows ");
		int rows = scn.nextInt();
		//int cols = scn.nextInt();

		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				if(i>=j) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}