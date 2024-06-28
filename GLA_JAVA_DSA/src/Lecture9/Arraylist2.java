package Lecture9;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
//		ArrayList<String> list1 = new ArrayList<>();
//		ArrayList<Character> list2 = new ArrayList<>();
		
		//add
//		list.add(10);
//		list.add(30);
//		list.add(0, 20);
//		
//		//remove
//		list.remove(0);
//		
//		//get
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
////		for (Integer i : list) {
////			System.out.println(i);
////		}
//		
//		//set
//		list.set(1, 3);
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		list.add(10);
		list.add(5);
		list.add(8);
		list.add(20);
		list.add(15);
		
		System.out.println(list);
		
		//sort
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
