/*

3
44
555
6666
555
44
3

*/

public class Pattern_22_DifferentTypesOfDiamond {
		
	public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
			int num=i+2;
			for (int j = 1; j<=i; j++){
				System.out.printf("%d",num);
			}
			System.out.println();
		}
		for (int i = 3; i !=0; i--) {
			int num=i+2;
			for (int j = 1; j<=3; j++) {
				if (j<=i) {
					System.out.printf("%d",num);
				} 
			 }
			System.out.println();
		}
    }
}