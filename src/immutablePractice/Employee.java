package immutablePractice;

public final class Employee {

	private final int emp_id;
	private final String emp_name;
	
	
	public Employee(int emp_id, String emp_name) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	}


	/*public static Employee createInstance(int eid, String ename){
		return new Employee(eid,ename);
	}*/
	
	public int getEmp_id() {
		return emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}
	
	public String toString(){
		return emp_id+ " " + emp_name+" ";
	}
	
}
