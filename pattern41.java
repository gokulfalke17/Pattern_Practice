/*
**********
****    ****
***        ***
**            **
*                *

*/
class pattern41 {
	public static void main(String[] args) {
		int row = 5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row*2;j++) {
				if(j<=row+1-i || j>=row+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}