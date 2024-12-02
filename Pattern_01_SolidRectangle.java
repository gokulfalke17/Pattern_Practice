/*
SolidRectangle
* * * * *
* * * * *
* * * * *

*/

import java.util.*;
public class Pattern_01_SolidRectangle {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows and Cols ");
		int rows = scn.nextInt();
		int cols = scn.nextInt();

		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(i<=rows || j<=cols) {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}
}