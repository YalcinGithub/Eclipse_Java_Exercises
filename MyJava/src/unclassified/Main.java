package unclassified;

public class Main{
	 public static void DoPrint(Base o) {
		 o.Print();
	 }
	 public static void main(String[] args) {
		
		 Base x=new Base();
		 Derived z=new Derived();
		 DoPrint(x);
		 DoPrint(z);
	}
	 
}

class Base {
	public void Print() {
		System.out.println("Base");
	}
}
 class Derived extends Base{
	 public void Print() {
		 System.out.println("Derived");
	 }
 }
 