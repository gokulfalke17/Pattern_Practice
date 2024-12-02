/*

1        1
12      21
123    321
1234  4321
1234554321

*/

public class Pattern_PrintFollowingPyramid {

    public static void main(String[] args) {
        for (int i = 0; i <6; i++){
            for (int a = 1; a <=5; a++)
				if (a<=i){
					System.out.print(a+"");
				}else{
					System.out.print(" ");
				}
            for (int k = 5; k !=0; k--)	{ 
                if (k<=i){
                    System.out.print(k+"");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
