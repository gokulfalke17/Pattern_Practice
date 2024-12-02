class pattern44 {
	public static void main(String[] args) {
		boolean flag = true;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i<=3) {
					if(j>=5-i && j<=3+i) {
							System.out.print("*");
							flag = false;
					}else {
						System.out.print(" ");
						flag = true;
					}
				}else {
					if(j>=i-3 && j<=11-i) {
						System.out.print("*");
						flag = false;
					}else {
						System.out.print(" ");
						flag = true;
					}
				}
			}
			System.out.println();
		}
	}

}