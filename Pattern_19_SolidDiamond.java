/*
    *
   * *
  * * *
 * * * *
* * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/

public class Pattern_19_SolidDiamond {
	
	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
				for (int j=1;j<=9;j++) {
					if (j<=4+i && j>=6-i && (i+j)%2==0) {
						System.out.printf("*");
					}else{
						System.out.printf(" ");
					}
				}
			System.out.println();
			}
			for (int i=1; i<=5;i++) {
				for (int j=i-1;j!=0;j--) {
					System.out.printf(" ");
				}
				for (int j=1;j<=5;j++) {
					if (j<=6-i) {
						System.out.printf("* ");
					}
           
				}
				System.out.println();
			}
	}
}