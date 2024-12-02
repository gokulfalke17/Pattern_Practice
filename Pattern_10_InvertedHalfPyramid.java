/*
Inverted Half Pyramid
1 2 3 4 5
1 2 3 4
1 2 3 
1 2 
1

*/

public class Pattern_10_InvertedHalfPyramid {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<=6-i) {
					System.out.printf("%d",j);
				}
			}
			System.out.println();
		}
	}
}