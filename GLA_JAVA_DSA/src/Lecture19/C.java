package Lecture19;

public class C extends P {
	String name = "Child";
	int id = 20;
	
	public void f2() {
		System.out.println("f2 in C");
	}
	
	@Override
	public void f() {
		super.f();
		System.out.println("f in C");
	}
}
