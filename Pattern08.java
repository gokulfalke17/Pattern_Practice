/*
******
*****
****
***
**
*

*/
class Pattern08 {
	
	public static void main(String[] args) {
		
		int row = 6;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(i<=j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}