package com.finezoom.training.java.col.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	add();
	//	remove();
	//find();
		//update();
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
      //  insertAndPrint(map);
	}
	//update
	private static void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aTreemap = new HashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aTreemap.put(i, name);
		}
		for (Entry<Integer, Name> test : aTreemap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		System.out.println("update the key pair");
		Name name = new Name();
		System.out.println("Enter the key");
		int keyVal = scan.nextInt();
		System.out.println("Enter the key value");
		name.setName(scan.next());
		Name fin = aTreemap.put(keyVal, name);
		// System.out.println(fin.getName());
		for (Entry<Integer, Name> test : aTreemap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		
		
		
	}
	//find
	private static void find() {
		
		Map<Integer,Name> aTreemap = new TreeMap<Integer,Name>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();		
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aTreemap.put(i, name);
		}
		for(Map.Entry<Integer, Name> atest : aTreemap.entrySet()){
			System.out.println(atest.getKey()+":"+atest.getValue().getName());
		}
		System.out.println("find the value");
		int keyVal = scan.nextInt();
		Name fin = aTreemap.get(keyVal);
		System.out.println(fin.getName());
	}
	//remove the element
	private static void remove() {
		Map<Integer,Name> aTreemap = new TreeMap<Integer,Name>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();		
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aTreemap.put(i, name);
		}
		for(Map.Entry<Integer, Name> atest : aTreemap.entrySet()){
			System.out.println(atest.getKey()+":"+atest.getValue().getName());
		}
		System.out.println("Remove the value");
		int remVal = scan.nextInt();
		aTreemap.remove(remVal);
		System.out.println("After remove the value");
		for(Map.Entry<Integer, Name> atest : aTreemap.entrySet()){
			System.out.println(atest.getKey()+":"+atest.getValue().getName());
		}
		
	}
	
	//add element
	public static void add(){
		TreeMap<Integer,Name> aTreemap = new TreeMap<Integer,Name>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();		
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aTreemap.put(i, name);
		}
		for(Map.Entry<Integer, Name> atest : aTreemap.entrySet()){
			System.out.println(atest.getKey()+":"+atest.getValue().getName());
		}
	}
	
	static void insertAndPrint(Map<Integer, String> map)
    { 
        int[] array= {1, -1, 0, 2,-2};
        for (int x: array) 
        { 
            map.put(x, Integer.toString(x)); 
        } 
        for (int k: map.keySet())
        {
            System.out.print(k + ", "); 
        }
    } 
}
