/*
class Pattern05 {
	
	public static void main(String[] args) {
		
		int rows = 6;
		int cols = 11;
		boolean flag = true;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols;j++) {
				if(j<=rows-i || j>=rows+i || flag) {
					System.out.print(" ");
					flag = false;
				}else {
					System.out.print("*");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}
*/

class Pattern05 {
	
	public static void main(String[] args) {
		
		int rows = 6;
		int cols = 11;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=cols+1;j++) {
				if(j<=rows-i+1 || j>=rows+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
