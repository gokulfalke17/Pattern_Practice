class Pattern02{
	public static void main(String[] args) {
		
		int rows = 6;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i>=j) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
}