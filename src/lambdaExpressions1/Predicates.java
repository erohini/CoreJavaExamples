package lambdaExpressions1;

import java.util.function.Predicate;

public class Predicates {

	public static Predicate<Student> isOlderThan(int age){
        return x-> x.getAge() > age;
    }

    public static Predicate<Student> isCSStudent(){
        return x-> x.getCourse().equalsIgnoreCase("CS");
    }
    
    public static Predicate<Student> isECStudent(){
        return x-> x.getCourse().equalsIgnoreCase("EC");
    }

    public static Predicate<Student> isECStudentAndHasEvenID() {
        return x -> x.getCourse().equalsIgnoreCase("EC") && x.getId()%2==0;
    }
}
