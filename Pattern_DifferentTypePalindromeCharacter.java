/*
A
B A B
C B A B C
D C B A B C D
E D C B A B C D E
*/

public class Pattern_DifferentTypePalindromeCharacter {
   public static void main(String[] args) {
    
        int i,j =0;
        for (i= 1; i<= 5; i++){
            for(j=i;j>0;j--){
                System.out.print((char)(j+64)+" ");
            } 
            for(j=2;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }              
            System.out.println();
        }
   } 
}
