/*
ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A

*/

public class Pattern_FollowingPyramid {

    public static void main(String[] args) {
        for (int i = 0; i <5; i++){
           for (int k = 65; k <=69-i; k++){
				System.out.printf("%c",k);
           }
           for (int j = 1; j <=i*2-1; j++){  
                System.out.printf(" ");  
            }
            for(int a = 69-i; a >=65; a--) {
                if (a!=69){
                    System.out.printf("%c",a);
                }  
            }
           System.out.println();
        }   
    }
}
