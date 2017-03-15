package collectionPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QueueExample {

	public QueueExample() {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		System.out.println(pq.size());
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(3);
		pq.add(5);
		pq.add(6);
		pq.add(7);
		System.out.println(pq.size());
		System.out.println(pq.peek());
		
		while(!pq.isEmpty()){
		System.out.println(pq.poll());
		}
		
		
	}
	
}
