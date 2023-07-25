package core.java.methods;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Cars cars = new Cars();
//		Cars cars2 = new Cars("SUV", "ACcord");
//		
		
		Hondas hondas = new Hondas();
		hondas.carDetails();
		
//		Hondas hondas1 = new Cars("ABC", "XYZ");
		
		Hondas hondas2 = new Hondas("ABC", "XYZ");
		hondas2.carDetails();
	}

}

abstract class Cars {
	String model;
	String carType;

	public Cars() {

	}

	public Cars(String model, String carType) {
		this.model = model;
		this.carType = carType;
	}

	public abstract void carDetails();
	
}

class Hondas extends Cars{

	public Hondas() {
		
	}
	
	public Hondas(String model, String carType) {
		super.model = model;
		super.carType = carType;
	}
	@Override
	public void carDetails() {
		// TODO Auto-generated method stub
		System.out.println("Printing from Honda class");
		System.out.println("The model is: " +super.model);
		System.out.println("The carType is: " +super.carType);
	}
	
	
}