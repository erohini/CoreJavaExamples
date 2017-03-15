package immutablePractice;

public class ImmutablePractice {

	public static void main(String[] args) {
		Employee e=new Employee(1, "Sairam");
		System.out.println(e);
		test(e.getEmp_id(),e.getEmp_name());
		System.out.println(e);
	}
	
	private static void test(int id, String name){
		id=2;
		name="omsairam";
	}

}
