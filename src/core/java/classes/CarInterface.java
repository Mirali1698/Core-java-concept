package core.java.classes;

public interface CarInterface {

	//After java 8 interface is providing facility to define static and default method
//	public static void carRun() {
//		System.out.println("Car is Running");
//	}

	//Final method not allowed in interface
//	public final void carRun() {
//		System.out.println("Car is running");
//	}

	//After java 8 interface is supporting default method
//	public default void carRun() {
//		System.out.println("Car is running");
//	}

	//in interface simple method is by default abstract no need to write abstract
	public void carRun();

}

class HondaInterfaceDemo implements CarInterface, BikeInterface {

	//when inheriting interface the abstract method should be implement
	public void carRun() {
		System.out.println("Car is Running from Honda class");
	}
	
	public void bikeRunning() {
		System.out.println("Bike is running from Honda class");
	}
	
	public void vehicleType() {
		System.out.println("Vehicle type is 4-wheel");
	}
}

class FordInterfaceDemo implements CarInterface {

	//abstract method need to implement when inheriting CarInterface
	public void carRun() {
		// TODO Auto-generated method stub
		System.out.println("Car is Running from Ford class");
	}

	
}