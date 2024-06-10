package _01_FactoryPattern;

public class ProductRun {

	public static void main(String[] args) {
	
		Proudct p1 = new Product();
		p1.setName("Tv");
		System.out.println(p1);
		
		Proudct p2 = new Product();
		p2.setName("Computer");
		System.out.println(p2);
	}

}
