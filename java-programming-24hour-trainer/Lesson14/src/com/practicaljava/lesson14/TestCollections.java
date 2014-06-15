package com.practicaljava.lesson14;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class TestCollections {

	public void doCollections(){
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(1);
		arrayList.add(new File(""));
		
		for(Object o: arrayList){
			System.out.println(o.toString());
		}
	}
	
	public void doGeneric() {
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		// ERRO ArrayList<int> ints = new ArrayList<int>();
		
		inteiros.add(1);
		inteiros.add(2);
		inteiros.add(3);
		inteiros.add(4);
		inteiros.add(5);
		
		System.out.println(inteiros.size());
		
		System.out.println(inteiros.get(0).toString());
		
		//ERRO System.out.println(inteiros[0].toString());
		
		for (int i: inteiros) {
			System.out.println(i);
		}
	}
	
	public void doHash() {
		Hashtable ht = new Hashtable();
		
		ht.put("key", "value");
		
		Enumeration items = ht.keys();
		
		while(items.hasMoreElements()) {
			System.out.println(items.nextElement().toString());
		}
		
		
	}
}
