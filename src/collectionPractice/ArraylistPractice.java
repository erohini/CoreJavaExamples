package collectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArraylistPractice {

	public ArraylistPractice() {
		List<Integer> list1=new ArrayList<Integer>();
		for(int i=1;i<=10000;i++){
			list1.add(i);
		}
		
		System.out.println("initial size: "+list1.size());
		
//		int y=1;
//		for(int x=3001;x<=4000;x++){
//				list1.add(x,y);
//				y++;
//		}
		long startTime=System.currentTimeMillis();
		list1.removeAll(list1);
		long endTime=System.currentTimeMillis();
		System.out.println("size after removing elements: "+list1.size());
//		System.out.println("size after inserting elements: "+list1.size());
		long time=endTime-startTime;
		System.out.println("Time taken to remove elements from ArrayList "+time);
//		System.out.println("Time taken to insert elements to ArrayList "+time);
	}
}
