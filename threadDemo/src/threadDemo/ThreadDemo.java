package threadDemo;

public class ThreadDemo extends Thread{
	public void run() {
		System.out.println("Inside run() Thread is alive or not " + this.isAlive());
		int num = 0;
		while(num < 4) {
			num++;
			System.out.println("Number = " + num);
			try {
				sleep(500);
			}
			catch(Exception E) {
				System.out.println("Thread Interrupted");
			}
		}
	}
}
