package com.tns.Interfaces;

	//Demo on Tree Set
	
	import java.util.*;

	class TreeSetDemo {
		public static void main(String args[]) 
		
		{	TreeSet<Integer> treeSet1=new TreeSet<Integer>();
			treeSet1.add(56);
			treeSet1.add(62);
			treeSet1.add(50);
			treeSet1.add(10);
			treeSet1.add(15);
			treeSet1.add(62);
			
		
			
			//Ascending order
			System.out.println(treeSet1);
		
			// remove()
			// clone()
		
//			TreeSet<String> treeSet2 = new TreeSet<String>(); 
	//
//			treeSet2.add("One");
//			treeSet2.add("Two");
//			treeSet2.add("Three");
//			treeSet2.add("Four");
//			treeSet2.add("Five");
	//
//			System.out.println("Contents of treeset");
//			//cursor 
//			Iterator iterator = treeSet2.iterator(); // obtaining iterator object
//			while (iterator.hasNext()) { // to iterate through collection.
//				Object object = iterator.next();
//				System.out.print(object + "\t");
//			}
		}
	}


