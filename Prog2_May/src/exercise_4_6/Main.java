//****************************************************************************//
//Updated Contents:
//1. Abstraction in Fruit class, line 29.
//2. Interface  class, Discount rate added 
//	 and implementation in Fruit class, line 16.
//****************************************************************************//

package exercise_4_6;

public class Main {

	public static void main(String[] args) {
		Apple s = new Apple("Apel", "tasteless", 100, 20,5);	//price,mass,quan
		s.printHint();
		System.out.println(s);// Overriding toString of Fruit
		s.printSugarPercentage(100, 1);
		//Overloading method in apple class
		s.printPricePerMass();
		s.printTotalPrice();

		GreenApple GA = new GreenApple("Unripe Apple", "Sour", 50, 30,5 , 14);//price,mass,quan,vit
		GA.printHint();
		System.out.println(GA);// Overriding toString of Apple
		GA.printSugarPercentage(100, 2);
		//Overloading method inherited from apple class
		GA.printPricePerMass();
		GA.printTotalPrice();

		RedApple RA = new RedApple("Little Apple", "Sweet", 100, 20,5, 7);//price,mass,quan,vit
		RA.printHint();
		System.out.println(RA);// Overriding toString of Apple
		RA.printSugarPercentage(100, 0.5);
		//Overloading method inherited from apple class
		RA.printPricePerMass();
		RA.printTotalPrice();

		Lemon LE = new Lemon("Yellow lemon", "very sour",20, 4, 1);//price,quan,mass
		LE.printHint();
		System.out.println(LE);// Overriding toString of Fruit
		LE.printTotalPrice();

		Mango MA = new Mango("Cute mango", "very sweet", 5, 14);
		MA.printHint();
		System.out.println(MA);// Overriding toString of Fruit
		MA.printTotalPrice();
	}

}
