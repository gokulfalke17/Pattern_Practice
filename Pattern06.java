/*

     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

	(OR)

     *
    ***
   *****
  *******
 *********
***********

*/
class Pattern06 {
	
	public static void main(String[] args) {
		
		int row = 6;
		boolean flag = true;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row*2-1;j++) {
				if(j>=row-i+1 && j<=row+i-1 && flag) {
					System.out.print("*");
					flag = false;
				}else {
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println();
		}
		
		/*int row = 6;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row*2-1;j++) {
				if(j>=row-i+1 && j<=row+i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}*/

	}
}