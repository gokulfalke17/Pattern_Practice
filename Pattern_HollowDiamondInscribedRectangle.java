/*
 1
 1 1
 1 2 1
 1 3 3 1
 1 4 6 4 1
 1 5 10 10 5 1
 1 6 15 20 15 6 1
*/

public class Pattern_HollowDiamondInscribedRectangle {

    public static void main(String[] args) {
        int i,j,num=1;
        for(i=0;i<7;i++){
			for(j=0;j<=i;j++){
				if (j==0||i==0)
					num=1;
				else
					num=num*(i-j+1)/j;
				System.out.print(" "+num);
			}
			System.out.println();
		}
	}
}

