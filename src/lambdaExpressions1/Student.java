package lambdaExpressions1;

public class Student {
	private int id;
	private String name;
	private int age;
	private String course;
	private void student() {

	}
	
	public Student(int id, String name, int age, String course) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCourse() {
		return course;
	}
	
	public String toString(){
		return id+" "+name+" "+age;
	}

}
