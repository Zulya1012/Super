package spr;

public class Dog extends Animal{
	int price;
	String name;
	
	Dog(int weight, String brade, int price, String name){	
		super(weight, brade);
		this.price = price;
		this.name = name;
		
	}

}

class Empty extends Object{
	Empty(){
		super();
	}
}