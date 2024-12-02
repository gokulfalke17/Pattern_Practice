/*
Hollow Inverted Half Pyramid
1 2 3 4 5 
2     5
3   5
4 5
5

*/

public class Pattern_14_HollowInvertedHalfPyramid {
    public static void main(String[] args) {
        for (int i =1; i <=5; i++) {
            for (int j = i; j <=5; j++) {
                if (i==1||j==i||j==5) {
                    System.out.printf(j+" ");
                }
                else{
                     System.out.printf("  ");
                }
            }
            System.out.println();
        }
    }
}
