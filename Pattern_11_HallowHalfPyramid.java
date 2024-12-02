/*
Hallow Half Pyramid
1
1 2
1   3
1     4
1 2 3 4 5

*/

public class Pattern_11_HallowHalfPyramid {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==5 || j==1 ||i==j) {
					System.out.printf("%d ",j);
				}else {
					System.out.printf("  ");
				}
			}
			System.out.println();
		}
	}
}