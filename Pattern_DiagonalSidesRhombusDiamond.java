/*

*******
**   **
* * * *
*  *  *
* * * *
**   **
*******

*/

public class Pattern_DiagonalSidesRhombusDiamond {

    public static void main(String[] args) {

        for (int i = 1; i <=7; i++){
			for (int j = 1; j <=7; j++){
				if (j==1 || j==7 || i==1||i==7||j==i||j==8-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
    }
}
