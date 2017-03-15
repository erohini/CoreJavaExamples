package collectionPractice;

public class Student implements Comparable<Student> {

	private Integer id;
	private String name;
	
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o){
		Student s=(Student) o;
		if(this.id==s.id){
			return true;
		}
		else 
			return false;
	}
	
	public int hashCode(){
		return id*10;
	}
	@Override
	public int compareTo(Student arg0) {
		return this.getId().compareTo(arg0.getId());
	}
	
	
	
}
