package LambdaExpDemo;

public class LambdaWithoutParameter {


	interface IStatement {
		    String show();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IStatement s = () -> {return "Hello world";};
		System.out.println(s.show());

	}

}
