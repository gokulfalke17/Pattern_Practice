/*

    *
     *
      *
       *
*********
       *
      *
     *
    *

*/

public class Pattern_RightArrows {

    public static void main(String[] args) {
        for (int i = 1; i <=9; i++){
			for (int j = 1; j <=9; j++){
				if (i==5|| j==4+i||j==14-i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				} 
			}
			System.out.println();
		 }
    }
}
