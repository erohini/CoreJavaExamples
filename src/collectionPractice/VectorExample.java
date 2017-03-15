package collectionPractice;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public VectorExample() {
		Vector<String> vector=new Vector<String>(3);
		System.out.println("Initial capacity: "+vector.capacity());
		System.out.println("Initial size: "+vector.size());
		vector.add("Sairam");
		vector.add("Rohini");
		vector.add("Kavya");
		vector.add("Geethika");
		vector.add("Dheeraj");
		System.out.println("Capacity: "+vector.capacity());
		System.out.println("size: "+vector.size());
		System.out.println(vector);
		
		Enumeration e=vector.elements();
		while(e.hasMoreElements()){
			String s=(String) e.nextElement();
			if(s.equals("Rohini")){
				vector.remove(s);
				System.out.println(s+ " is removed");
			}
			
		}
		
		System.out.println(vector);
	}
	
}
