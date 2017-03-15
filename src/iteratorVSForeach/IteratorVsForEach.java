package iteratorVSForeach;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorVsForEach {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(2);
		l.add(3);
		l.add(4);

		List<Integer> s = new LinkedList<Integer>();
		s.add(2);
		s.add(4);
		s.add(5);
		s.add(6);

		
		/*for (Iterator<Integer> itr1 = l.iterator(); itr1.hasNext();) {
			for (Iterator<Integer> itr2 = s.iterator(); itr2.hasNext();) {
				if (itr1.next() < itr2.next()) {
					System.out.println(itr1.next());
				}
			}
		}
		 */
		
		/*Iterator<Integer> itr1=l.iterator();
		Iterator<Integer> itr2=s.iterator();
		
		while()*/

		/*for (int a : l) {
			for (int b : s) {
				if (a < b)
					System.out.print(a + " ");
			}
		}*/
	}

}
