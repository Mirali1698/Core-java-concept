package core.java.thread;

class MyThread extends Thread {
	public void run() {
		System.out.println("shut down hook task completed..");
	}
}

public class TestShutdown1 {
	public static void main(String[] args) throws Exception {

		MyThread mt = new MyThread();
		MyThread mt1 = new MyThread();

		Runtime r = Runtime.getRuntime();

		r.addShutdownHook(mt);
//		r.removeShutdownHook(mt);

		System.out.println("Now main sleeping... press ctrl+c to exit");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}
}