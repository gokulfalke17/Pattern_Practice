class pattern30 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i<=5) {
					if(i==5 || j==6-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(j==i-4) {
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