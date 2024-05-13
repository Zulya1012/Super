package spr;

public class Dispatcher {

	public static void main(String[] args) {
		Dog d = new Dog (3, "Poodle", 50, "Rex");
		System.out.println(d.getWeight() + " " + d.getBrade() + " " + d.price + " " + d.name);
	}

}
