/*

0        0
01      01
010    010
0101  0101
0101001010

*/

public class Pattern_Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i <5; i++){
       
        for (int a = 0; a <=4; a++)
			if (a<=i){
				System.out.printf("%d",a%2);
			}else{
				System.out.printf(" ");
			}
			for (int k = 0; k <=4; k++){
				if (k>=4-i){
					System.out.printf("%d",(i+k)%2);
				}else{
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
    }
}
