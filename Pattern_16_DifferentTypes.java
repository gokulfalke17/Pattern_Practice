/*

A
A B A
A B C B A
A B C D C B A
A B C D F D C B A
*/

public class Pattern_16_DifferentTypes {
	
	public static void main(String[] args) {
        for (int i=1;i<=5;i++) {
            char ch=65;
            for (int j=1;j<=i*2-1;j++) {
                System.out.printf(ch+" ");
                if (i>j) {
                    ch++;
                }else{
                    ch--;
                }
            }
            System.out.println("");
        }
    }

}	