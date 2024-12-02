class pattern35 {
	
	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=7;j++) {
				if(i<=4) {
					if(i==1 || (i==2 && j<=5) || (i==3 && j<=3) || (i==4 && j<=1)) {
						if(j%2==0) {
							System.out.print("*");
						}else {
							System.out.print(5-i);
						}
					}else{
						System.out.print(" ");
					}
				}else {
					int k=1;
					if((i==5 && j<=1) || (i==6 && j<=3) || (i==7 && j<=5) || (i==8 && j<=7)){
						if(true) {
							System.out.print("*");
						}else{
							System.out.print(" ");
						}
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}