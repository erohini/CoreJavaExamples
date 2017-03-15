package lambdaExpressions1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(1, "Rohini", 70, "EC");
		Student s2=new Student(2, "Kavya", 71, "EC");
		Student s3=new Student(3, "Geethika", 72, "CS");
		Student s4=new Student(4, "Dheeraj", 72, "MEC");
		Student s5=new Student(5, "Radhika", 72, "CS");
		Student s6=new Student(6, "Anvitha", 71, "CS");
		
		List<Student> students=new ArrayList<Student>();
		students.addAll(Arrays.asList(new Student[]{s1, s2, s3, s4, s5, s6}));
		
		List<Student> filteredList = students.stream().filter(Predicates.isCSStudent()).collect(Collectors.toList());
		System.out.println(filteredList);
		
		filteredList=students.stream().filter(Predicates.isOlderThan(70)).collect(Collectors.toList());
		System.out.println(filteredList);
		
		filteredList=students.stream().filter(Predicates.isCSStudent().negate()).collect(Collectors.toList());
		System.out.println(filteredList);
		
		filteredList=students.stream().filter(Predicates.isCSStudent().or(Predicates.isECStudent()).negate()).collect(Collectors.toList());
		System.out.println(filteredList);
		
		/*students.sort(Comparator.comparing(x->x.getName()));
		System.out.println(students);*/
		
		System.out.println(students.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList()));
		
		System.out.println(students.stream().sorted(Comparator.comparingInt(s->s.getAge())).collect(Collectors.toList()));
		
		students.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::print);
		System.out.println("\n");
		
		students.stream().filter(Predicates.isECStudentAndHasEvenID()).map(x->x.getName().toUpperCase()).forEach(x->System.out.println("Students names in uppercase: "+x));
		
		students.stream().map(x->x.getName().toUpperCase()).forEach(x->System.out.println(x));
	}

}
