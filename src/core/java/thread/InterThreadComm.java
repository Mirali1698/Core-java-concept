package core.java.thread;

//import org.omg.CORBA.PUBLIC_MEMBER;

public class InterThreadComm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final Customer c = new Customer();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				c.withdraw(2000);
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				c.deposite(5000);
			}
		});

//		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}

class Customer {
	int amount = 1000;

	synchronized void withdraw(int amount) {
		System.out.println("Customer going to withdraw.....");

		if (this.amount < amount) {
			System.out.println("Less balance; Customer waiting for Deposite...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			this.amount -= amount;
			System.out.println("Withdraw completed...& Current balance is." + this.amount);
		} else {

			this.amount -= amount;
			System.out.println("Withdraw completed...& Current balance is." + this.amount);
		}

	}

	synchronized void deposite(int amount) {
		System.out.println("Customer is going to deposite...");
		this.amount += amount;
		System.out.println("Deposite completed....");
		notify();
	}
}
