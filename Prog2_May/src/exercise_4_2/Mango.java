package exercise_4_2;

public class Mango extends Fruit{
	private int price;//in RM
	private int quantity;//in kg
	
	public Mango(String name, String taste,int price,int quantity) {
		super(name,taste);
		System.out.println("Mango constructor is invoked");
		this.price=price;
		this.quantity=quantity;
		System.out.println("");
	}
	
	public double DiscountPrice() {
		double rate=Discount(getPrice());
		return this.price*rate;
	}
	
	//Overriding print hint method in fruit class
	public void printHint() {
		System.out.println("This is a type of mango.");
		System.out.println("It tastes "+super.getTaste()+".");
	}
	
	public double totalPrice() {
		double pricePerMass=this.price*this.quantity;
		return pricePerMass;
	}
	
	public double sugarPer100g(double sugar,double mass) {	//sugar in gram, mass in kg
		mass=mass*1000;
		double sugarContain=(sugar/mass)*100;		//percentage of sugar contain by an apple
		return sugarContain;
	}
	
	public void printSugarPercentage(double s,double m) {
		System.out.printf("This contain %.2f%% of sugar."
				          ,sugarPer100g(s,m));
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	//Overriding toString of Fruit class
	public String toString() {
		return super.toString()
			  +"\nNumber : "+quantity+""
			  +"\nPrice  : "+"RM"+price
			  +"\nAfter discount: RM"+DiscountPrice()
			  +"\nTotal price: RM"+totalPrice();
	}

}
