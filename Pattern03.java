class Pattern03 {
	
	public static void main(String[] args) {
		
		int rows = 6;
		for(int i=0;i<rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(j<=rows-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}