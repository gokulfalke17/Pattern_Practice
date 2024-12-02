/*
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
*/
class pattern17 {
	public static void main(String[] args) {
		int row=10;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-1;j++) {
				if(i<=10/2) {
					if(j>=6-i && j<=4+i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else {
					if(j>=i-5 && j<=15-i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}