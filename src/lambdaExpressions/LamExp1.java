package lambdaExpressions;

public class LamExp1 {

	public LamExp1() {
		Func add = (int a, int b) -> a + b;
		Func sub = (int a, int b) -> { return a - b; };

		int result = add.calc(1, 2);
		System.out.println("Sum: "+result);

		result = sub.calc(1, 2);
		System.out.println("substraction: "+result);
	}
	
}
