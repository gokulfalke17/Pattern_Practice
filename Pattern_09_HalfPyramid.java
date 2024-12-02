/*
Half Pyramid
1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5

*/

public class Pattern_09_HalfPyramid {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.printf("%d",j);
				}
			}
			System.out.println();
		}
	}
}