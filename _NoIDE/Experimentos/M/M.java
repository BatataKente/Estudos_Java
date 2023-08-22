class A {
	int a;
	void m() {
		System.out.println(a);
	}
} 
class M {
	public static void main(String[] args) {
		A ob = new A();
		ob.a = 5;
		ob.m();
	}
} 