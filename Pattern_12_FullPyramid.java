/*
Full Pyramid
		1
      2	3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5

*/

public class Pattern_12_FullPyramid {
	
	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			int num=i;
			for(int j=1;j<=9;j++) {
				if(j>=6-num && j<=4+num) {
					System.out.printf("%d",num);
					if(j<5) {
						num++;
					}else {
						num--;
					}
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}