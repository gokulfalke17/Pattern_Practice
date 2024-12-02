interface A{
	void m1();

	/*public abstract void m3() {
		System.out.println("I'm Interface M3() Method");
	}*/
}

interface AA {
	void m2();
}
class B implements A, AA {
	public void m1() {
		System.out.println("B:M1() Method");
	}

	public void m2() {
		System.out.println("B:M2() Method");
	}
}

class Main {
	
	public static void main(String[] args) {
		
		B b1 = new B();
		b1.m1();
		b1.m2();
	}
}
