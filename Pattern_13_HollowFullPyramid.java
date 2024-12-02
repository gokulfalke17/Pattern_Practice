/*
Hollow Full Pyramid

    1
   1 2 
  1   3
 1     4
1 2 3 4 5

*/

public class Pattern_13_HollowFullPyramid {

	public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            for (int j=i;j<=5;j++) {
                System.out.printf(" ");
            }
            for (int j=1;j<=5;j++) {
                if (j<=i && i==5||j==1||j==i) {
                    System.out.printf(j+" ");
                }else{
                    System.out.printf("  ");
                }
            }
            System.out.println("");
        }
    }
}