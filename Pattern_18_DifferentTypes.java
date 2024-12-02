/*
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****

*/

public class Pattern_18_DifferentTypes {
	
	public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=17;j++) {
                if (j<=8+i && j>=10-i && (i+j)%2==0) {
                    System.out.printf(""+i);
                }
                else{
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
    }

}