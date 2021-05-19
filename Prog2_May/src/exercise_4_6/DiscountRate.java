package exercise_4_6;

interface DiscountRate {	//this is similar to abstraction for super class
	
	double discount(double price);
	
}

interface TotalPrice{
	double total(double price, double quantity);
}
