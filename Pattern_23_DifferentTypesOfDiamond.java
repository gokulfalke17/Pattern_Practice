/*

1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1

*/

public class Pattern_23_DifferentTypesOfDiamond {
	
	public static void main(String[] args) {
		 int num=0;
		 for (int i=0;i<5;i++) {
            num=i;
            for (int j=0;j< i * 2 - 1; j++) {
                if (j % 2 == 0) {
                    System.out.printf("%d",num);
                }else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
        for (int i=0;i<5;i++) {
            num = 5-i;
            num = 4-i;
            for (int j=0;j<=7-i*2-1;j++) {

                if (j%2==0) {
                    System.out.printf("%d", num);
                } else {
                    System.out.printf("*");
                }
            }
            System.out.println();
        }
	}
}