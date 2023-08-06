package core.java.thread;

public class PrintingEvenOdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		OddEven oe = new OddEven();

		// performing One task by two thread
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				oe.displayOddNumber(20);
			}
		});

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				oe.displayOddNumber(20);
			}
		});

//		th1.start();
//		th2.start();
		// end....

		// performing two task by two thread
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				oe.displayOddNumber(20);
				System.out.println(" ");
			}
		});

		Thread th4 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				oe.displayEvenNumber(20);
				System.out.println(" ");
			}
		});

		th4.setPriority(1);
		th4.join();
		th4.start();
		th3.start();
		
		// end....

	}

}

class OddEven {

	// Thread Synchronized using synchronized method
	 public void displayOddNumber(int n) {
//		System.out.println("Printing Odd Number...");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(" " + i + " ");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	 public void displayEvenNumber(int n) {
//		System.out.println("Printing Even Number...");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(" " + i + " ");
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
