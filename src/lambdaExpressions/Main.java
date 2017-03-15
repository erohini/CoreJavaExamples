package lambdaExpressions;

public class Main {

	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("Hello World");
		}).start();

		LamExp1 lam1=new LamExp1();
		LamExp2 lam2=new LamExp2();
		LamExp3 lam3=new LamExp3();

	}

}
