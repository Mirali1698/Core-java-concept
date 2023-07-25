package core.java.methods;

public class DemoMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda honda = new Honda();
		honda.carType = "SUV";
		honda.model = "accord";
		honda.year = 2020;
		honda.carDetails("civic", "Cedan");
		honda.carDetails("Suv", "Accord", 2022);

	}

}

class Car {
	String model;
	String carType;

	public Car() {

	}

	public Car(String model, String carType) {
		this.model = model;
		this.carType = carType;
	}

	public void carDetails(String model, String carType) {
		System.out.println("Printing from Car Class");
		System.out.println("The model of Car is:" + model);
		System.out.println("The carType is: " + carType);
	}
}

class Honda extends Car {

	String model;
	String carType;
	int year;

	public Honda(String model, String carType, int year) {

		this.model = model;
		this.carType = carType;
		this.year = year;
	}

	public Honda() {

	}

	public void carDetails(String model, String carType) {
		System.out.println("Print from the Honda class");
		System.out.println("The model is: " + model);
		System.out.println("The carType is: " + carType);
		System.out.println("The year is: " + this.year);
	}

	public void carDetails(String model, String carType, int year) {
		System.out.println("Print using three parameters from Honda class");
		System.out.println("The model is: " + model);
		System.out.println("The carType is: " + carType);
		System.out.println("The year is: " + year);
	}

}