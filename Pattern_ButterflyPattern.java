/*
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** *****
*/

public class Pattern_ButterflyPattern {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
        for (int j = 1; j <=11; j++) {
            if ( j>6-i && j<6+i) {
               System.out.printf(" ");
            }else {
                System.out.printf("*");
            }
            
        }
       System.out.println("");
    }
    for (int i = 1; i <=5; i++) {
        for (int j = 1; j <=11; j++){
            if ( j>i && j<=11-i){
                System.out.printf(" ");
            }else{
                System.out.printf("*");
            }
            
        }
       System.out.println("");
    }
    }
}
