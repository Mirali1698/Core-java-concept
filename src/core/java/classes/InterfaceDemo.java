package core.java.classes;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create interface object
		CarInterface car1;
		//give refernce to the object as a HondaInterfaceDemo
		car1 = new HondaInterfaceDemo();
		System.out.println("car1 is object of HondaInterface class: "+ (car1 instanceof HondaInterfaceDemo));
		//create instance of a VehicleInterface
		VehicleInterface vehicle;
		vehicle = new HondaInterfaceDemo();

	}

}
