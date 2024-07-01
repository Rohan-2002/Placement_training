package threadDemo;

public class ThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo th = new ThreadDemo();
		System.out.println("Before runnable stage thread is alive or not ?"+ th.isAlive());
		th.start();
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println("Thread was interrupted");
		}
		System.out.println("After complete execution of thread is alive or not ?"+ th.isAlive());

	}

}
