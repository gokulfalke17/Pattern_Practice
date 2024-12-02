class pattern25 {
	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i<=5) {
					if(j>=i && j<=10-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(j>=10-i && j<=i) {
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