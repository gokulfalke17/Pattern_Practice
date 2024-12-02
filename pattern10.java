/*
*
**
***
****
*****
******
*/
class pattern10 {
	
	public static void main(String[] args) {
		
		int row = 6;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				if(j<=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}