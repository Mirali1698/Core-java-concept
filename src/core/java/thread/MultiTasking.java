package core.java.thread;

public class MultiTasking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		Thread t1 = new Thread(new DemoThread1());
//		Thread t2 = new Thread(new DemoThread1());
//		
//		t1.start();
//		t2.start();

		for (int i = 1; i <= 5; i++) {
			Thread dti = new Thread(new DemoThread1()); // New born Thread
			dti.start(); // Thread entered in to Runnable stage, means thread is started
			dti.setName("Thred Number is..." + i);
			dti.join();  // Next Thread is not going to start until this finished
			if (i == 5) {
				dti.setDaemon(true);
				dti.setPriority(10); // Setting the priority of the thread from 0 to 10
				dti.join();
				dti.sleep(1000);
				System.out.println(dti.isDaemon());
			}

		}
	}

}

class DemoThread1 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
//			System.out.println("Printing from the ...." + i + " ....Thank you");
			System.out.println(Thread.currentThread().getName() + "  & NUmber of process  " + i + " Task Number 1..");
		}
	}
}
