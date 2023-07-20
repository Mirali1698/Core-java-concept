package core.java.classes;

public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creT=ate object of the Son class
		Son son = new Son();
		
		//son can access the variables and methods from the parent class- FatherInheritance class
		son.study();
		son.speaking();
		System.out.println("Son hair color is: " +son.hair);
		
		//son is instance of both class because it is inherited from FatherInheritance
		boolean c = son instanceof Son;
		boolean d = son instanceof FatherInheritance;
		System.out.println(c);
		System.out.println(d);
		System.out.println();
		
		//create the object of the FatherInheritance class
		FatherInheritance fatherInheritance = new FatherInheritance();
		
		//fatherInheritance cannot access the variables and methods of the Son class
		
		boolean e = fatherInheritance instanceof Son;
		System.out.println(e);
		boolean f = fatherInheritance instanceof FatherInheritance;
		System.out.println(f);
		
		
		System.out.println();
		System.out.println("Printing using Grandson Objects");
		
		//create the object of the Grandson class
		//grandson can access all the variable and methods from its parent class Son and FatherInheritance class
		GrandSon grandson = new GrandSon();
		grandson.hair = "grey";
		grandson.studyInCollege();
		grandson.speaking();
		grandson.standard = 2;
		grandson.study();
		System.out.println("Grandson's hair color is: " +grandson.hair);
		System.out.println("Grandson is instance of Son: " + (grandson instanceof Son));
		System.out.println("Grandson is instance of FatherInheritance: " + (grandson instanceof FatherInheritance));
		System.out.println("Grandson is instance of GrandSon: " + (grandson instanceof GrandSon));
		System.out.println();
		
		
		//create the object of the Daughter class
		//daughter can access all the variables and methods of the FatherInheritance class
		System.out.println("Printing using Daughter object");
		Daughter daughter = new Daughter();
		daughter.hair = "blue";
		daughter.study();
		daughter.speaking();
		System.out.println("Daughter is instance of Son: " + (daughter instanceof Daughter));
		System.out.println("Daughter is instance of FatherInheritance: " +(daughter instanceof FatherInheritance));
		System.out.println("fatherInheritance is instance of Daughter: " + (fatherInheritance instanceof Daughter));
	}

}
