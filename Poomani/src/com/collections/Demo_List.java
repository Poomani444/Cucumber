package com.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo_List {
	public static void main(String[] args) {
		
		List<Integer> ll = new ArrayList<Integer>();
		List<Integer> mm = new ArrayList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll);
		System.out.println(ll.size());  //size executed in length 
		mm.add(25);
		mm.add(null);
		mm.add(40);
		mm.add(55);
		mm.add(60);
		System.out.println(mm);
		mm.retainAll(ll);
		System.out.println(mm);
		System.out.println(mm.retainAll(ll));
		
		
	}

}
