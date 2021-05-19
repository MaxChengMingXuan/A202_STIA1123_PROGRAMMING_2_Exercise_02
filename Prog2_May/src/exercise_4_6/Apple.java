package exercise_4_6;

public class Apple extends Fruit {
	private int price;//in RM
	private int mass;//in kg
	private int quantity;
	
	public Apple(String name, String taste,int price,int mass,int quantity) {//constructor
		super(name,taste);
		System.out.println("Apple constructor is invoked");
		this.price=price;
		this.mass=mass;
		this.quantity=quantity;
		System.out.println("");
		
		if(this.mass<10) {
			totalGift();
			System.out.println(name);
			System.out.println("Number of gift: "+0);
		}
		else if(this.mass>=10&&this.mass<=100) {
			int giftCount=this.mass/10;
			totalGift(giftCount);
			System.out.println("Number of gift: "+totalGift(giftCount));
		}
		else {
			int giftCount=this.mass/5;
			double extraGift=1.5;
			totalGift(extraGift,giftCount);
			System.out.println("Number of gift: "+totalGift(extraGift,giftCount));
		}
	}

	
	//calculation of price after discount using discount rate
	public double DiscountPrice() {
		double rate=discount(getPrice());
		return this.price*rate;
	}
	
	public void printTotalPrice() {
		System.out.println("Total price: RM"+total(price,quantity)*discount(getPrice()));
	}
	
	
	//Implement sugarPer100g in Fruit class
	public double sugarPer100g(double sugar,double mass) {	//sugar in gram, mass in kg
		mass=mass*1000;
		double sugarContain=(sugar/mass)*100;		//percentage of sugar contain by an apple
		return sugarContain;
	}
	
	public void printSugarPercentage(double s,double m) {
		System.out.printf("This apple contain %.2f%% of sugar."
				          ,sugarPer100g(s,m));
	}
	
	//Overriding print hint method in fruit class
	public void printHint() {
		System.out.println("This is a type of apple.");
		System.out.println("It tastes "+super.getTaste()+".");
	}
	
	//Overloading ———— Gift
	public double totalGift() {
		return this.mass;
	}
	
	public double totalGift(int quantity) {
		return this.mass*quantity;
	}
	
	public double totalGift(double bigGift,int quantity) {
		return this.mass*quantity*bigGift;
	}
	
	//Overloading 1: output in RM/kg
	public double pricePerMass() {
		double pricePerMass=this.price/this.mass;
		return pricePerMass;
	}
	
	//Overloading 2: output in RM/gram
	public double pricePerMass(double price) {
		double pricePerMass=price/(this.mass*1000);
		return pricePerMass;
	}
	
	//Overloading 3: output in sen/gram
	public double pricePerMass(double price, double mass) {
		double pricePerMass=(price*100)/(mass*1000);
		return pricePerMass;
	}
	
	public void printPricePerMass() {
		System.out.printf("\nPrice Per Mass: RM%.4f/gram"		// Overloading 1 Argument
						 +"\n              : %.4fsen/gram\n"	// Overloading 2 Argument
						 ,pricePerMass(getPrice())
						 ,pricePerMass(getPrice(),getMass()));
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getMass() {
		return this.mass;
	}
	
	//Overriding toString method of Fruit class
	public String toString() {
		return super.toString()
			  +"\nMass : "+mass+"kg"
			  +"\nPrice: RM"+price
			  +"\nAfter discount: RM"+DiscountPrice()
			  +"\nPrice Per Mass: RM"+pricePerMass()+"/kg";
	}

}
