
class pattern19 {
	public static void main(String[] args) {
		boolean flag = true;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j>=i && j<=10-i && flag) {
					System.out.print("*");
					flag = false;
				}else {
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}