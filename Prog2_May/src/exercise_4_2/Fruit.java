package exercise_4_2;
//Super class of all fruits
//implement interface-Discount Rate
public abstract class Fruit implements DiscountRate{
	private String name;
	private String taste;
	
	public Fruit(String name,String taste) {
		System.out.println("——————————————————————————————————————————————"
						   +"\nFruit constructor is invoked");
		this.name =name;
		this.taste=taste;
	}
	
	//Implementation of discount rate
	public double Discount(double price) {
		if(price>=100) {
			return 0.5;
		}
		else if(price>=50) {
			return 0.7;
		}
		else {
			return 1.0;
		}
	}
	
	//abstract method printHint & sugar percentage
	public abstract void printHint();
	
	public abstract double sugarPer100g(double sugar,double mass);
	
	
	public String getName() {
		return this.name;
	}
	
	public String getTaste() {
		return this.taste;
	}
	
	
	public String toString() {
		return  "\nName : "+name
			   +"\nTaste: "+taste;
	}
}
