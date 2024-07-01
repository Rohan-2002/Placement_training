package BankingThreadDemo;

public class SyncronizationDemo {

	public static void main(String[] args) {

		Account acc = new Account(101, "Amit", 50000);
		System.out.println(acc);

		// Five account threads running parallel and sharing same resource
		AccountThread thread[] = new AccountThread[5];
		for (int i = 0; i < 5; i++) {
			thread[i] = new AccountThread(acc, 1000 * (i + 1));
			try {
				thread[i].join(); // waits main thread till execution of all child thread finish
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("--------------------------------------------------------");
		System.out.println(acc);

	}

}


/*
 * Output : Account [accNo=101, Name=Amit, balance=50000.0]
			after withdrwing Rs.1000 current Balance : Rs.49000.0
			after withdrwing Rs.2000 current Balance : Rs.47000.0
			after withdrwing Rs.3000 current Balance : Rs.44000.0
			after withdrwing Rs.4000 current Balance : Rs.40000.0
			after withdrwing Rs.5000 current Balance : Rs.35000.0
			--------------------------------------------------------
			Account [accNo=101, Name=Amit, balance=35000.0]
 */
