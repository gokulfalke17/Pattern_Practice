class pattern21 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=9;j++) {
				if(i<=10/2) {
					if(i+j==6 || j-i==4) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(i-j==5 || j+i==15) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}