package core.java.thread;

public class BasicThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoThread dt1 = new DemoThread();
//		DemoThread dt2 = new DemoThread();
//		DemoThread dt3 = new DemoThread();
//		DemoThread dt4 = new DemoThread();

		System.out.println(Thread.currentThread());

//		dt4.start();
//		dt4.run();
//		System.out.println(Thread.activeCount());
//		dt4.stop();
//		System.out.println(Thread.activeCount());

		System.out.println("  ...... ************............  ");
		for (int i = 1; i <= 5; i++) {
			DemoThread dti = new DemoThread(); // New born Thread
			dti.start(); // Thread entered in to Runnable stage, means thread is started
//			dti.setName("Thred Number is..." + i);
//			dti.join();  // Next Thread is not going to start until this finished
//			if(i ==5) {
//				dti.setDaemon(true);
//				dti.setPriority(10);   // Setting the priority of the thread from 0  to 10 
//				dti.join();
//				dti.sleep(1000);
//				System.out.println(dti.isDaemon());
//}
			DemoThread dt = new DemoThread();
            System.out.println(dt.getX());  
		}

		System.out.println();
		System.out.println(Thread.activeCount());
		
//		//Thread - It is a small task 
//
//		//creating object of demoThread class to inherit the properties of thread
//		DemoThread dt1 = new DemoThread();
//		DemoThread dt2 = new DemoThread();
//		DemoThread dt3 = new DemoThread();
//		DemoThread dt4 = new DemoThread();
//
//		//currentThread method get the name of the running thread
//		System.out.println("Current thread name: " + Thread.currentThread());
//		//activeCount method to get the count of running thread
//		System.out.println("Current thread count: " + Thread.activeCount());
//
//		//put the thread in starting mode
//		dt1.start();
//		dt2.start();
//		dt3.start();
//
//		//run method to run the thread
//		dt1.run();
//		dt2.run();
//		System.out.println("Current thread name: " + Thread.currentThread());
//		System.out.println("Current thread count: " + Thread.activeCount());
//
//		for (int i = 1; i < 5; i++) {
//			//create thread using thread class object
//			DemoThread ddi = new DemoThread(i);
//			//start thread
//			ddi.start();
//			//run the thread
//			ddi.run();
//			System.out.println(ddi.getX());
////			System.out.println("Current thread inside for name: " + Thread.currentThread());
////			System.out.println("Current thread inside for count: " + Thread.activeCount());
		}

}
	
//create DemoThread class which inherit the properties of the Thread class
class DemoThread extends Thread {
	int x;

	public DemoThread() {

	}

	public DemoThread(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setx(int x) {
		this.x = x;
	}

	// override the run method of thread class
	public void run() {
		for (int i = 0; i < 1000000000; i++) {
			x = x + 1;
		}
	}
}
