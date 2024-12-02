/*
*********
 *******
  *****
   ***
    *
*/
class pattern16 {
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row*2-1;j++) {
				if(j>=i && j<=10-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}