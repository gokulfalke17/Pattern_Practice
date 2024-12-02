/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1

*/

public class Pattern_17_DifferentTypes {
	
	public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            int num=1;
            for (int j=i;j<5;j++) {
                System.out.printf("  ");
            }
            for (int j=1;j<=i*2-1;j++) {
                System.out.printf(num+" ");
                if (i>j) {
                    num++;
                }else{
                    num--;
                }
            }
            System.out.println("");
        }
    }

}