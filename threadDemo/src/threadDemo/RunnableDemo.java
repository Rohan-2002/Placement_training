package threadDemo;

class ThreadOne extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("print thread one");
		}
		
		try {
			Thread.sleep(500);
		}catch(Exception e) {
			System.out.println("thread was interrupteed");
		}
	}
}

class ThreadTwo extends Thread{
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("print thread two");
		}
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println("thread was interrupteed");
		}
	}
}

//class ThreadThree {

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadOne obj1 = new ThreadOne();
		ThreadTwo obj2 = new ThreadTwo();
	}
}
