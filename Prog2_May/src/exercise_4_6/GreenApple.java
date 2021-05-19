package exercise_4_6;

public class GreenApple extends Apple{
	private double vitaminC;//percentage of vitamin C
	
	public GreenApple(String name, String taste, int price, int mass,int quantity,double vitamin) {
		super(name, taste, price, mass,quantity);
		this.vitaminC=vitamin;
	}
	
	//Overriding print hint method in apple class
	public void printHint() {
		System.out.println("This is a type of green apple.");
		System.out.println("It tastes "+super.getTaste()+".");
	}
	
	//price of 1kg vitamin C
	public double vitaminValue() {
		double vitValue=super.getPrice()/(this.vitaminC/100*super.getMass());
		return vitValue;
	}
	
	//Overriding sugarPer100g in Fruit class
	public double sugarPer100g(double sugar,double mass) {	//sugar in gram, mass in kg
		mass=mass*1000;
		double sugarContain=(sugar/mass)*100;		//percentage of sugar contain by an apple
		return sugarContain;
	}
	
	public void printSugarPercentage(double s,double m) {
		System.out.printf("This green apple contain %.2f%% of sugar."
				          ,sugarPer100g(s,m));
	}
	
	public double getVitaminC() {
		return this.vitaminC;
	}
	
	
	
	//Overriding toString of Apple class
	public String toString() {
		return super.toString()
			  +"\nPercentage of vitamin C: "+vitaminC+"%"
			  +"\nPrice of 1kg Vitamin C : RM"+vitaminValue();
	}
	
}
