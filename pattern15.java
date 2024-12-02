/*
    *
   ***
  *****
 *******
*********
*/
class pattern15 {
	public static void main(String[] args) {
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row*2-1;j++) {
				if(j>=6-i && j<=4+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}