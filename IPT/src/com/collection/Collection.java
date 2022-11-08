package com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collection {
	
	public static void main(String[] args) {
		
		//Array
	int[] a = new int[3];
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	System.out.println(a[2]); // get any single value
	
	for (int i : a) {
		System.out.println(i); // get all values using foreach
		}
	
	//List
	
	List<Integer> l = new ArrayList<>();
	l.add(33);
	l.add(44);
	l.add(55);
	System.out.println(l.get(1));   //get single value
	System.out.println(l);          //get all values
	
	//Set
	Set<Float> s = new HashSet<>();
	s.add(22.2f);
	s.add(33.33f);
	s.add(44.44f);
	System.out.println(s); // get all values
	
	//Map
	Map<Integer, String> m = new HashMap<>();
	m.put(1, "vijay");
	m.put(2, "ajith");
	System.out.println(m);              // get all values
	Set<Integer> keySet = m.keySet();
	System.out.println(keySet);         // get key values only
	java.util.Collection<String> values = m.values();
	System.out.println(values);         // get values only
	Set<Entry<Integer, String>> entrySet = m.entrySet();
	System.out.println(entrySet);       // get key & values separately  (Doubt)
	}
}
