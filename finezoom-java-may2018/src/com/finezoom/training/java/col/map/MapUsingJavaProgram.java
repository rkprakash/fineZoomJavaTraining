package com.finezoom.training.java.col.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * Hashmap
 *
 */
public class MapUsingJavaProgram {
	public static void main(String args[]) {
		// add();
		// remove();
		// find();
		update();
	}

	public static void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aHashmap = new HashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aHashmap.put(i, name);

		}

		// System.out.println(Arrays.asList(aHashmap));
		// System.out.println(Collections.singletonList(aHashmap));
		for (Map.Entry<Integer, Name> entry : aHashmap.entrySet()) {
			System.out.println(entry.getKey() + " : "
					+ entry.getValue().getName());
		}
		// System.out.println(aHashmap.values());
	}

	// remove the element
	public static void remove() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aHashmap = new HashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aHashmap.put(i, name);

		}

		for (Map.Entry<Integer, Name> entry : aHashmap.entrySet()) {
			System.out.println(entry.getKey() + " : "
					+ entry.getValue().getName());
		}
		System.out.println("Remove the key pair");
		int keyVal = scan.nextInt();
		aHashmap.remove(keyVal);

		for (Map.Entry<Integer, Name> test : aHashmap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		System.out.println(aHashmap.keySet());

	}

	// find the key pair
	public static void find() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aHashmap = new HashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aHashmap.put(i, name);
		}
		for (Entry<Integer, Name> test : aHashmap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		System.out.println("Find the key pair");
		int keyVal = scan.nextInt();
		Name fin = aHashmap.get(keyVal);
		System.out.println(fin.getName());

	}

	// update
	public static void update() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aHashmap = new HashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aHashmap.put(i, name);
		}
		for (Entry<Integer, Name> test : aHashmap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		System.out.println("update the key pair");
		Name name = new Name();
		System.out.println("Enter the key");
		int keyVal = scan.nextInt();
		System.out.println("Enter the key value");
		name.setName(scan.next());
		Name fin = aHashmap.put(keyVal, name);
		// System.out.println(fin.getName());
		for (Entry<Integer, Name> test : aHashmap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
	}

	public static void details() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		Map<Integer, Name> aHashmap = new HashMap<Integer, Name>();
		System.out.println("Enter the input value");

		for (int i = 0; i < size; i++) {
			Name name = new Name();
			name.setName(scan.next());
			aHashmap.put(i, name);
		}
		for (Entry<Integer, Name> test : aHashmap.entrySet()) {
			System.out.println(test.getKey() + ":" + test.getValue().getName());
		}
		
	}
}
