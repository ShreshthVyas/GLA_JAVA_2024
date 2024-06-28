package Lecture9;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		long start = System.currentTimeMillis();
//		for (int i = 0; i <1000000; i++) {
//			
//		}
//		long end = System.currentTimeMillis();
		
//		System.out.println(end-start);
		
		int n =10000;
		int i =0;
		
		while(i<=n) {
			System.out.println("hello");
			i++;
		} //O(n)
		
		while(i<=n) {
			System.out.println("hello");
			n--;
		}//O(n)
		
		while(i<=n) {
			System.out.println("hello");
			i+=3;
		} //O(n)
		
		while(i<=n) {
			System.out.println("hello");
			i+=3;
			i+=2;
		} // O(n)
		
		while(i<=n) {
			System.out.println("hello");
			i*=2;
		} //o(logn)
		
		while(i<=n) {
			System.out.println("hello");
			n/=2;
		}//O(logn)
		
		while(i<=n) {
			System.out.println("hello");
			i*=2;
			i*=3;
		}//O(log6N) ignore log base
		int k =10;
		while(i<=n) {
			System.out.println("hello");
			i+=k;
		} //O(n/k)
		
		while(i<=n) {
			System.out.println("hello");
			i*=k;
		} // O(log base k N)
		
		for (int j = 0; j < n; j++) {
			for (int a = 0; a < n; a++) {
				System.out.println();
			}
		} //O(n^2)
		
		for (int j = 0; j < n; j++) {
			for (int a = j+1; a < n; a++) {
				System.out.println();
			}
		} //O(n^2)
		
		for (int j = 0; j*j <=n ; j++) {
			System.out.println();
		} // O(sqrt N)
		
		for (int a = 0; a <=n ; a++) {
			for (int j = 1; j <= a*a; j++) {
				for (int b = 0; b <=n/2; b++) {
					System.out.println();
				}
			}
		} // O(n^4)
		
		for (int a = n/2; a <=n ; a++) {
			for (int j = 1; j <= n/2; j++) {
				for (int b = 1; b <=n/2; b*=2) {
					System.out.println();
				}
			} //O(n^2 log n)
		}
		
		for (int j = 1; j <=n; j*=2) {
			System.out.println();
		} // O(log N)
		
		
		//Bubble Sort - O(n^2)
		//Insertion Sort - O(n^2)
		// Selection Sort - O(n^2)
		// Binary Search - O(log N)
	}

}
