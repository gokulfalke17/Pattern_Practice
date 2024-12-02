/*
    *
   * *
  *   *
 *     *
*       *
*       *
 *     *
  *   *
   * *
    *

*/

public class Pattern_20_HollowDiamond {
	
	 public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=9;j++) {
                if (j==4+i || j==6-i && (i+j)%2==0) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=9;j++) {
				if (j==i || j==10-i) {
					System.out.printf("*");
                }else {
                    System.out.printf(" ");
                }  
            }
            System.out.println();
        }
    }
}	