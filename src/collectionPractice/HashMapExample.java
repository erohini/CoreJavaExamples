package collectionPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapExample {

	public HashMapExample() {
		/*HashMap<Student,String> hm=new HashMap<Student,String>();
		System.out.println(hm.size());
		hm.put(new Student(1,"Sairam"), "Student1");
		hm.put(new Student(2,"Rohini"), "Student2");
		hm.put(new Student(1,"OMSairam"), "Student3");
		
		Set s= hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext()){
			Map.Entry e=(Entry) i.next();
			Student k=(Student) e.getKey();
			String v=(String) e.getValue();
			System.out.println(k+": "+v);
		}*/
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		System.out.println(hm.size());
		hm.put(2, "Rohini");
		hm.put(1, "Sairam");
		hm.put(2, "Kavya");
		hm.put(5, "Dheeraj");
		hm.put(4, "Geethika");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry e=(Map.Entry)i.next();
			int k=(int)e.getKey();
			String v=(String)e.getValue();
			System.out.println(k+"="+v);
		}
		
//		hm.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));
		System.out.println("-------------------");
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		System.out.println(tm.size());
		tm.put(2, "Rohini");
		tm.put(1, "Sairam");
		tm.put(2, "Kavya");
		tm.put(5, "Dheeraj");
		tm.put(4, "Geethika");
		
		tm.forEach((k,v)->System.out.println("Key: "+k+" Value: "+v));
		System.out.println("--------------------");
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		System.out.println(lhm.size());
		lhm.put(2, "Rohini");
		lhm.put(1, "Sairam");
		lhm.put(2, "Kavya");
		lhm.put(5, "Dheeraj");
		lhm.put(4, "Geethika");
		Set s3=lhm.entrySet();
		Iterator i3=s3.iterator();
		while(i3.hasNext())
		{
			Map.Entry e=(Map.Entry)i3.next();
			int k=(int)e.getKey();
			String v=(String)e.getValue();
			System.out.println(k+"="+v);
		}
		
	}
	
	
	
}
