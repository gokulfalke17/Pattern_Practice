class pattern32 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=7;j++) {
				if((j==5-i || j==8-i) || (i==1 && j>=4) || (i==4 && j<=4)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}