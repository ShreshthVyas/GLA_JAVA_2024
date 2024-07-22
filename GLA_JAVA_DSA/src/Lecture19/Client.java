package Lecture19;

public class Client {

	public static void main(String[] args) {
		//Case 1
//		P obj  = new P();
//		System.out.println(obj.id);
//		System.out.println(obj.name);
//		obj.f();
//		obj.f1();
//		obj.f2();
		
		// Case 2
//		C obj1 = new C();
//		System.out.println(obj1.id);
//		System.out.println(obj1.name);
//		
//		System.out.println(((P) obj1).id);
//		System.out.println(((P) obj1).name);
//		
////		obj1.f1();
//		obj1.f();
//		((P) obj1).f();
		
		
		// Case-3
		P obj2 = new C();
//		System.out.println(obj2.id);
//		System.out.println(obj2.name);
//		
//		System.out.println(((C) obj2).id);
//		System.out.println(((C) obj2).name);
		
		obj2.f();
//		obj2.f2();
		
		// 
//		C obj3 = (C) new P();
//		System.out.println(obj3.id);
//		System.out.println(obj3.name);
//		
//		obj3.f();
//		obj3.f1();
		
		
	}
}
