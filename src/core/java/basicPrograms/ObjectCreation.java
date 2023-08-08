package core.java.basicPrograms;

public class ObjectCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectCreation obj1 = new ObjectCreation();
		
		Demo demo = new Demo(123,"ABC");

	}

}


class Demo{
	int i;
	String j;
	public Demo(int i, String j) {
		// TODO Auto-generated constructor stub
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getJ() {
		return j;
	}
	public void setJ(String j) {
		this.j = j;
	}
	
}