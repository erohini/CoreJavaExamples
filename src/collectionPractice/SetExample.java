package collectionPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	Student student;
	public SetExample() {
		Set<Student> set1=new HashSet<Student>();
		
		
		set1.add(new Student(1,"Sairam"));
		set1.add(new Student(2,"Kavya"));
		set1.add(new Student(2,"Rohini"));
		set1.add(new Student(4,"Geethika"));
		set1.add(new Student(5,"Dheeraj"));
		/*set1.add(3);
		set1.add(5);
		set1.add(7);
		set1.add(2);
		set1.add(6);
		System.out.println("HashSet: "+set1);*/
		
		Iterator i=set1.iterator();
		while(i.hasNext()){
			Student s = (Student) i.next();
			System.out.println(s.getId()+": "+s.getName());
		}
		
		
		
		
		Set<Integer> set2=new LinkedHashSet<Integer>();
		set2.add(3);
		set2.add(5);
		set2.add(7);
		set2.add(2);
		set2.add(6);
		System.out.println("LinkedHashSet: "+set2);
		
		TreeSet<Student> set3 = new TreeSet<Student>();
		/*set3.add(3);
		set3.add(5);
		set3.add(7);
		set3.add(2);
		set3.add(6);*/
		
		set3.add(new Student(1,"Sairam"));
		set3.add(new Student(5,"Kavya"));
		set3.add(new Student(3,"Rohini"));
		set3.add(new Student(4,"Geethika"));
		set3.add(new Student(2,"Dheeraj"));
		Iterator i1=set3.iterator();
		while(i1.hasNext()){
			Student s = (Student) i1.next();
			System.out.println(s.getId()+": "+s.getName());
		}
//		System.out.println("Treeset: "+set3.);
	}
	
}
