package com.finezoom.training.java.col.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class JavaUseLinkedMap {
	
	
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//add();
		find();
	}
	
	

	//Add elements
	public static void add() {
		Map<Integer, Name> aLink = new LinkedHashMap<Integer, Name>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();		
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aLink.put(i, name);
		}
		System.out.println("LinkedHashMap");
		for (Entry aTest : aLink.entrySet()) {
			System.out.println(((Name) aTest.getValue()).getName());
		}
		
	}
	
	//find elements
	private static void find() {
		Map<Integer, Name> aLink = new LinkedHashMap<Integer, Name>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();		
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aLink.put(i, name);
		}
		System.out.println("LinkedHashMap");
		for (Entry aTest : aLink.entrySet()) {
			System.out.println(((Name) aTest.getValue()).getName());
		}
		
		
		//System.out.println(((Name) aTest.getValue()).getName());
		System.out.println("find the value");
		int keyVal = scan.nextInt();
		Name fin = aLink.get(keyVal);
		System.out.println(fin.getName());
	}
	
	private static void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aLink = new LinkedHashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aLink.put(i, name);
		}
		for (Entry<Integer, Name> test : aLink.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		System.out.println("update the key pair");
		Name name = new Name();
		System.out.println("Enter the key");
		int keyVal = scan.nextInt();
		System.out.println("Enter the key value");
		name.setName(scan.next());
		Name fin = aLink.put(keyVal, name);
		// System.out.println(fin.getName());
		for (Entry<Integer, Name> test : aLink.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		
		
		
	}

}
