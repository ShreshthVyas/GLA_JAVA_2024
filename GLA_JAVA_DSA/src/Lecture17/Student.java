package Lecture17;

public class Student {
	int id;
	String name;
	
	static int count =20;
	
//	public Student() {
//		
//	}
//	public Student(int n) { 
//		id = n;
//	}
//	public Student(int id ,String name) {
//		this.id =id;
//		this.name = name;
//	}
	
	public static void greet() {
		System.out.println("Hi ");
	}
	
	public  void GreetMentor(String name) {
		System.out.println(this.name + " says hi to " + name);
	}
	
//	static {
//		System.out.println("Hi from static");
//		System.out.println(count);
//		int a =20;
//	}

//	public int getId() {
//		return id;
//	}

	public void setId(int id) throws Exception {
		try {
			if(id<0) {
			throw new Exception("id cannot be -ve");
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally");
		}
		this.id = id;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
	
	
}
