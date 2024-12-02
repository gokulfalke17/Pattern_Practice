class pattern39 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j>=6-i) {
					System.out.print(k++);
				}else {
					System.out.print(" ");
					k--;
				}
			}
			System.out.println();
		}
	}
}