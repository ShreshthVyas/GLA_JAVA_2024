package Lecture19;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add());
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2.2,1,25,6,7,8,9,4,5,6,7,8));
	}
	
	public static int add() {
		return 0;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b,int c) {
		return a+b+c;
	}
	public static int add(int a, double b) {
		return (int)(a+b);
	}
	public static int add(int a, double b, int... args) {
		int sum = (int)(a+b);
		
		for (int i = 0; i < args.length; i++) {
			sum+= args[i];
		}
		
		return sum;
	}
	
	

}
