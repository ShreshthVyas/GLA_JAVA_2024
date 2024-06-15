package Lecture3;

public class FunctionArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b =20;
		add(a,b);
		System.out.println("..........");
		add(30,40);	
	}
	public static void add(int z,int x) {
		int sum =z+x;
		System.out.println(sum);
	}

}
