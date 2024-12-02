/*

        1
      2   3
    4   5   6
  7   8   9   10

*/

public class Pattern_NumberTriangle {
    public static void main(String[] args) {
        int num=1;
        for (int i = 1; i <=4; i++) {
			 for (int j = 1; j <=9; j++) {
                if (j<=4+i && j>=6-i && (i+j)%2==0 ) {
                    System.out.printf(num+" ");
                    num++;
                }else{
                    System.out.printf("  ");
                }
            }
            System.out.println();
        }
       
    }
}
