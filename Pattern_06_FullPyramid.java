/*
Full Pyramid
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

import java.util.*;
public class Pattern_06_FullPyramid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows and Cols ");
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		boolean flag=true;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(j<=rows-i || j>=rows+i || flag) {
					System.out.printf(" ");
					flag=false;
				}else{
					System.out.printf("*");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}
