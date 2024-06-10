package Lecture1;

public class GradeCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 45;
		
//		if(marks>=80) {
//			System.out.println("A");
//		}
//		else if(marks>= 60) {
//			System.out.println("B");
//		}
//		else if(marks>=40) {
//			System.out.println("C");
//		}
//		else {
//			System.out.println("Fail");
//		}
		
		if(marks<40) {
			System.out.println("Fail");
		}
		else if(marks>=40 && marks<60) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
	}

}
