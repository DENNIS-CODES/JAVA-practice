// Java program to iterate the elements 
// in an ArrayList 

import java.util.*; 

public class GFG { 

	public static void main(String args[]) 
	{ 
		ArrayList<String> al 
			= new ArrayList<>(); 

		al.add("Geeks"); 
		al.add("Geeks"); 
		al.add(1, "For"); 

		// Using the Get method and the 
		// for loop 
		for (int i = 0; i < al.size(); i++) { 

			System.out.print(al.get(i) + " "); 
		} 

		System.out.println(); 

		// Using the for each loop 
		for (String str : al) 
			System.out.print(str + " "); 
	} 
} 
