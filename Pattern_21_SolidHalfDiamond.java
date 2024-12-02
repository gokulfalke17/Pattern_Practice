/*

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/

public class Pattern_21_SolidHalfDiamond {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=i) {
					System.out.printf("* ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j>=i) {
					System.out.printf("* ");
				}
			}
			System.out.println();
		}
	}
}