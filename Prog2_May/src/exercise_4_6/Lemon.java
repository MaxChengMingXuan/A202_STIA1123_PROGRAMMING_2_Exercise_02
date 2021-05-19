package exercise_4_6;

public class Lemon extends Fruit{
	private int quantity;//in RM
	private int mass;//in kg
	private double price;
	
	public Lemon(String name, String taste,int price,int quantity,int mass) {
		super(name,taste);
		System.out.println("Lemon constructor is invoked");
		this.quantity=quantity;
		this.mass=mass;
		this.price=price;
		System.out.println("");;
	}
	
	//calculation of price after discount using discount rate
	public double DiscountPrice() {
		double rate=discount(getPrice());
		return this.price*rate;
	}
	
	public void printTotalPrice() {
		System.out.println("Total price: RM"+total(price,quantity)*discount(getPrice()));
	}
	
	//Overriding print hint method in fruit class
	public void printHint() {
		System.out.println("This is a type of lemon.");
		System.out.println("It tastes "+super.getTaste()+".");
	}
	
	public double totalMass() {
		double pricePerMass=this.quantity*this.mass;
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
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public int getMass() {
		return this.mass;
	}
	
	//Overriding toString of Fruit class
	public String toString() {
		return super.toString()
			  +"\nMass  : "+mass+"kg"
			  +"\nNumber: "+quantity
			  +"\nTotal mass: "+totalMass()+"kg";
	}

}
