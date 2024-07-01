package BankingThreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Executor {

	public static void main(String[] args) {
		Account a1 = new Account(101, "Amit", 50000);
		System.out.println(a1);

		ExecutorService executor = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 10; i++) {
			Runnable task = new AccountThread(a1, 1000 * (i + 1));
			executor.submit(task);
		}

		executor.shutdown();
		try {
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("------------------------------------");
		System.out.println(a1);
	}
}

/*
 * Output : Account [accNo=101, Name=Amit, balance=50000.0]
			after withdrwing Rs.1000 current Balance : Rs.49000.0
			after withdrwing Rs.6000 current Balance : Rs.43000.0
			after withdrwing Rs.8000 current Balance : Rs.35000.0
			after withdrwing Rs.8000 current Balance : Rs.27000.0
			after withdrwing Rs.9000 current Balance : Rs.18000.0
			after withdrwing Rs.1000 current Balance : Rs.17000.0
			after withdrwing Rs.6000 current Balance : Rs.11000.0
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			after withdrwing Rs.5000 current Balance : Rs.6000.0
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			Insufficient balance in your account
			------------------------------------
			Account [accNo=101, Name=Amit, balance=6000.0]
 */

