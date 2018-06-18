package com.finezoom.training.java.oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c;
        c = new ArrayList(); // creates a new collection based on the implementation ArrayList
        System.out.println(c.getClass().getName());
        for (int i=1; i <= 10; i++) { 
            c.add(i + " * " + i + " = "+i*i); // adds an element to the ArrayList
        }
        Iterator iter = c.iterator(); // creates an iterator for looping
        while (iter.hasNext()) // checks whether there are elements still available in the collection
            System.out.println(iter.next());// reads the next element aand prints

	}

}
