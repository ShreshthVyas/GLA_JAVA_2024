package Lecture8;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<String> list1 = new ArrayList<>();
//		ArrayList<Character> list2 = new ArrayList<>();
		
		list.add(10);
		list.add(30);
		list.add(0, 20);
		
		list.remove(0);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Integer i : list) {
			System.out.println(i);
		}
		
		
	}

}
