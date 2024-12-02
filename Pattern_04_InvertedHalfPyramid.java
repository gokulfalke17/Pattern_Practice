/*
Inverted Half Pyramid
* * * * * *
* * * * *
* * * *
* * * 
* * 
*

*/

import java.util.*;
public class Pattern_04_InvertedHalfPyramid {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows ");
		int rows = scn.nextInt();

		for(int i=0;i<rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(j<=rows-i){
				System.out.printf("*");
				}else{
				System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}